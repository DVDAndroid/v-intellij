package com.dvd.idea.vlanguage.file

import com.dvd.idea.vlanguage.VLanguage
import com.dvd.idea.vlanguage.icons.VIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

open class VFileType : LanguageFileType(VLanguage.INSTANCE) {

    companion object {
        @JvmField val INSTANCE = VFileType()
    }

    override fun getName(): String = "V"

    override fun getIcon(): Icon? = VIcons.FILE

    override fun getDefaultExtension(): String = "v"

    override fun getDescription(): String = "V language file"

}