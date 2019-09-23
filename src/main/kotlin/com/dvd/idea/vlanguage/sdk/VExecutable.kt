package com.dvd.idea.vlanguage.sdk

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessHandler
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.util.SystemInfo
import java.io.File
import java.util.concurrent.Future

val suggestedPath = when {
    SystemInfo.isWindows -> "C:\\v"
    SystemInfo.isLinux -> "/usr/local/bin/v"
    else -> null
}

val executable = if (SystemInfo.isWindows) "v.exe" else "v"

fun validExec(path: String?) = path != null && File(path).run { exists() && canExecute() }

fun getVVersion(path: String?): Future<String>? {
    if (!validExec(path)) return null

    return ApplicationManager.getApplication().executeOnPooledThread<String> {
        return@executeOnPooledThread CapturingProcessHandler(GeneralCommandLine(path, "-v")).runProcess(1000).stdout
    }
}