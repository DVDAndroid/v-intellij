package com.dvd.idea.vlanguage.run

import com.intellij.execution.Executor
import com.intellij.execution.configurations.ConfigurationFactory
import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.configurations.RunConfigurationBase
import com.intellij.execution.configurations.RunProfileState
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project

class VRunConfiguration(
    project: Project,
    factory: ConfigurationFactory,
    name: String
) : RunConfigurationBase<RunProfileState>(project, factory, name) {

    var scriptPath: String? = null

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> = VRunSettings()

    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState? = null

}
