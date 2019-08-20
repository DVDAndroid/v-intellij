package com.dvd.idea.vlanguage.settings

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.util.xmlb.XmlSerializerUtil
import java.io.File

@State(
    name = "VSettings",
    storages = [Storage("vSettings.xml")]
)
class VSettings : PersistentStateComponent<VSettings> {

    var interpreterPath: String? = null

    companion object {
        val instance: VSettings get() = ServiceManager.getService(VSettings::class.java)

        fun hasInterpreter(): Boolean = instance.interpreterPath.run {
            this != null && File(this).canExecute()
        }

    }

    override fun getState(): VSettings? = this

    override fun loadState(state: VSettings) = XmlSerializerUtil.copyBean(state, this)

}