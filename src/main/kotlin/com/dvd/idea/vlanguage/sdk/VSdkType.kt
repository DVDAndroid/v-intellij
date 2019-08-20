package com.dvd.idea.vlanguage.sdk

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.execution.process.CapturingProcessHandler
import com.intellij.icons.AllIcons
import com.intellij.openapi.projectRoots.*
import org.jdom.Element
import javax.swing.Icon


class VSdkType : SdkType("VSDK") {

    override fun getPresentableName(): String = "V SDK"

    override fun isValidSdkHome(path: String?): Boolean = true /*File("$path/compiler").run {
        exists() && isDirectory
    }*/

    override fun suggestSdkName(currentSdkName: String?, sdkHome: String?): String =
        getVersionString(sdkHome) ?: "V SDK"

    override fun suggestHomePath(): String? = suggestedPath

    override fun createAdditionalDataConfigurable(
        sdkModel: SdkModel,
        sdkModificator: SdkModificator
    ): AdditionalDataConfigurable? = null

    override fun getVersionString(sdkHome: String?): String? {
        if (!validExec("$sdkHome\\$executable")) return null

        return CapturingProcessHandler(GeneralCommandLine("$sdkHome\\$executable", "-v")).runProcess(1000).stdout
    }

    override fun saveAdditionalData(additionalData: SdkAdditionalData, additional: Element) {}

    override fun getIcon(): Icon = AllIcons.General.Information

    override fun getIconForAddAction(): Icon = icon

}