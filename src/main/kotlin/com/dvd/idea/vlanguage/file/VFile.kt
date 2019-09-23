package com.dvd.idea.vlanguage.file

import com.dvd.idea.vlanguage.VLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class VFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, VLanguage.INSTANCE) {

    override fun getFileType(): FileType = VFileType.INSTANCE

    override fun toString(): String = "V language file"

}