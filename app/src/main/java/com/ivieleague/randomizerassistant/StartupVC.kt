package com.ivieleague.randomizerassistant

import android.view.View
import com.ivieleague.randomizer.logic.Keysanity
import com.ivieleague.randomizer.logic.Status
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.VCContext
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import org.jetbrains.anko.*

class StartupVC(val stack:VCStack) : AnkoViewController() {
    override fun createView(ui: AnkoContext<VCContext>): View = ui.scrollView {
        isFillViewport = true
        verticalLayout {

            textView{
                styleDefault()
                textResource = R.string.app_name

            }.lparams(matchParent, wrapContent){ margin = dip(8) }

            button{
                textResource = R.string.alttp_keysanity

                setOnClickListener {
                    stack.push(AssistantVC(stack, Keysanity.game, Status()))
                }

            }.lparams(matchParent, wrapContent){ margin = dip(8) }


        }.lparams(matchParent, wrapContent)
    }

}

