package com.github.yikunz.tortoisegitcaller.actions

import com.github.yikunz.tortoisegitcaller.Command
import com.intellij.openapi.actionSystem.*

internal class ShowLogAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project
        val basePath = project?.basePath
        if (basePath != null) {
            Command.log(basePath)
        }
    }
}