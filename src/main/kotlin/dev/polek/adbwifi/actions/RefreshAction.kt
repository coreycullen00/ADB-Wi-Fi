package dev.polek.adbwifi.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.project.DumbAware
import dev.polek.adbwifi.services.AdbService

class RefreshAction : AnAction(), DumbAware {

    override fun actionPerformed(e: AnActionEvent) {
        log.debug("Refresh")
        val adbService = ServiceManager.getService(AdbService::class.java)
        log.debug("devices: ${adbService.devices()}")
    }

    companion object {
        private val log = logger("RefreshAction")
    }
}