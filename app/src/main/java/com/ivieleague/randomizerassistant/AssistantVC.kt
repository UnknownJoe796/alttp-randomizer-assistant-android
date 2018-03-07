package com.ivieleague.randomizerassistant

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.BitmapDrawable
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import com.ivieleague.randomizer.logic.Game
import com.ivieleague.randomizer.logic.Location
import com.ivieleague.randomizer.logic.Status
import com.ivieleague.randomizer.logic.itemValues
import com.lightningkite.kotlin.anko.image.getBitmapFromUri
import com.lightningkite.kotlin.anko.lifecycle
import com.lightningkite.kotlin.anko.observable.adapter.listAdapter
import com.lightningkite.kotlin.anko.observable.adapter.listAdapterObservable
import com.lightningkite.kotlin.anko.selectableItemBackgroundResource
import com.lightningkite.kotlin.anko.verticalGridRecyclerView
import com.lightningkite.kotlin.anko.verticalRecyclerView
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.VCContext
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import com.lightningkite.kotlin.async.doUiThread
import com.lightningkite.kotlin.async.invokeAsync
import com.lightningkite.kotlin.observable.list.ObservableListWrapper
import com.lightningkite.kotlin.observable.property.*
import org.jetbrains.anko.*

class AssistantVC(val stack: VCStack, val game: Game, status: Status) : AnkoViewController() {
    var oldStatusObs = status
    val statusObs = StandardObservableProperty<Status>(status)
    fun newStatus(status:Status){
        oldStatusObs = statusObs.value
        statusObs.value = status
    }
    fun rollback(){
        statusObs.value = oldStatusObs
    }

    val availableNewLocations = ObservableListWrapper<Location>()
    init{
        statusObs.addAndInvoke {
            {
                it.availableLocations(game)
                        .filter { l -> l.name !in it.locationsFound }
                        .sortedBy { it.name }
            }.invokeAsync {
                availableNewLocations.replace(it)
            }
        }
    }

    val items = game.itemValues().map { it.first }

    override fun createView(ui: AnkoContext<VCContext>): View = ui.linearLayout {

        val images = loadImages(context)

        verticalRecyclerView {
            adapter = listAdapter(availableNewLocations) { itemObs ->
                textView{
                    styleDefault()
                    padding = dip(8)
                    backgroundResource = selectableItemBackgroundResource
                    lifecycle.bind(itemObs){
                        text = it.name
                    }
                    setOnClickListener {
                        statusObs.value = statusObs.value.found(itemObs.value.name)
                    }
                }.lparams(matchParent, wrapContent)
                Unit
            }
        }.lparams(0, matchParent, 1f)

        val size = dip(64)
        val columns = context.displayMetrics.widthPixels / 2 / size
        verticalGridRecyclerView(columns) {
            adapter = listAdapter(items) {itemObs->
                frameLayout{
                    val itemAndCount = CombineObservableProperty2(itemObs, statusObs){ item, status ->
                        item to status.inventory.getOrDefault(item.name, 0)
                    }
                    itemAndCount += {}

                    backgroundResource = selectableItemBackgroundResource
                    setOnClickListener {
                        statusObs.value = statusObs.value.cycle(game, itemObs.value.name)
                    }

                    imageView{
                        scaleType = ImageView.ScaleType.FIT_CENTER
                        lifecycle.bind(itemAndCount.subObs {
                            val image = it.first.images.getOrNull(it.second.minus(1).coerceIn(0, it.first.images.lastIndex))
                            if(image == null) ConstantObservableProperty<Bitmap?>(null) else images[image] ?: ConstantObservableProperty<Bitmap?>(null)
                        }){
                            if(it != null){
                                setImageBitmap(it)
                                if(itemAndCount.value.second == 0){
                                    setColorFilter(Color.DKGRAY, PorterDuff.Mode.MULTIPLY)
                                } else {
                                    colorFilter = null
                                }
                            } else
                                setImageDrawable(null)
                        }
                    }.lparams(matchParent, matchParent)

                    textView{
                        styleDefault()
                        padding = dip(2)
                        lifecycle.bind(itemAndCount){
                            visibility = if(it.second > 1) View.VISIBLE else View.GONE
                            text = it.second.toString()
                        }
                    }.lparams(wrapContent, wrapContent, Gravity.TOP or Gravity.END)

                    textView{
                        styleDefault()
                        padding = dip(2)
                        lifecycle.bind(itemAndCount){
                            text = it.first.imageText
                        }
                    }.lparams(wrapContent, wrapContent, Gravity.BOTTOM or Gravity.END)

                }.lparams(size, size)
                Unit
            }
        }.lparams(0, matchParent, 1f)
    }

    private fun loadImages(context: Context): Map<String, StandardObservableProperty<Bitmap?>> {
        return items.flatMap { it.images }.associate {
            val obs = StandardObservableProperty<Bitmap?>(null)
            if (it.contains("://")) {

            } else {
                doAsync {
                    try {
                        val bit = BitmapFactory.decodeStream(context.assets.open(it))
                        doUiThread { obs.value = bit }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
            it to obs
        }
    }
}