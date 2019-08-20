package com.dvd.idea.vlanguage.sdk

import com.intellij.openapi.util.SystemInfo
import java.io.File


val suggestedPath = when {
    SystemInfo.isWindows -> "C:\\AAAAAAAv"
    SystemInfo.isLinux -> "/usr/local/bin/v"
    else -> null
}

fun getExeFromPath(): String? {
    val path = System.getenv("PATH")
    for (pathEntry in path.split(";")) {
        if (File(pathEntry, executable).run { exists() && canExecute() }) return pathEntry
    }

    return null
}

val executable = if (SystemInfo.isWindows) "v.exe" else "v"

fun validExec(path: String?) = path != null && File(path).run { exists() && canExecute() }
