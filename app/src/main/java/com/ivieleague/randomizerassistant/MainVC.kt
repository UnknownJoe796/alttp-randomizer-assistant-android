package com.ivieleague.randomizerassistant

import android.view.View
import com.lightningkite.kotlin.anko.viewcontrollers.AnkoViewController
import com.lightningkite.kotlin.anko.viewcontrollers.VCContext
import com.lightningkite.kotlin.anko.viewcontrollers.containers.VCStack
import org.jetbrains.anko.*

class MainVC : AnkoViewController() {

    val stack = VCStack().apply{
        stack.push(StartupVC(this))
    }

    override fun createView(ui: AnkoContext<VCContext>): View = ui.viewContainer(ui.owner, stack)
    override fun onBackPressed(backAction: () -> Unit) {
        stack.onBackPressed(backAction)
    }
}

