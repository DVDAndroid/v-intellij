package com.dvd.idea.vlanguage.run

import com.intellij.execution.configurations.*
import com.intellij.icons.AllIcons
import com.intellij.openapi.project.Project

class VRunConfigurationType : ConfigurationTypeBase(
    "VRunConfigurationType",
    "V",
    "V run configuration",
    AllIcons.General.Information
) {

    init {
        addFactory(object : ConfigurationFactory(this) {
            override fun createTemplateConfiguration(project: Project): RunConfiguration =
                VRunConfiguration(project, this, "V")

            override fun getSingletonPolicy(): RunConfigurationSingletonPolicy =
                RunConfigurationSingletonPolicy.SINGLE_INSTANCE_ONLY
        })
    }

    val factory: ConfigurationFactory get() = configurationFactories.single()

    companion object {
        val instance: VRunConfigurationType get() = ConfigurationTypeUtil.findConfigurationType(VRunConfigurationType::class.java)
    }

}