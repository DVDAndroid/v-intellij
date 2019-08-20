package com.dvd.idea.vlanguage

import com.intellij.notification.Notification
import com.intellij.notification.NotificationListener
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.roots.ui.configuration.ProjectSettingsService
import javax.swing.event.HyperlinkEvent


class VStartup : com.intellij.openapi.startup.StartupActivity {

    var interpreter = false

    override fun runActivity(project: com.intellij.openapi.project.Project) {
        // check if interpreter is defined
        if (!interpreter) {
            Notifications.Bus.notify(
                Notification(
                    "V Language Support",
                    "No V interpreter defined",
                    "<html>You can set an interpreter under <a href='#' target=\"blank\">Project Structure</a></html>",
                    NotificationType.ERROR,
                    NotificationListener { notification, event ->
                        notification.expire()
                        if (event.eventType == HyperlinkEvent.EventType.ACTIVATED)
                            ProjectSettingsService.getInstance(project).chooseAndSetSdk()
                    }
                )
            )
        }
    }

}