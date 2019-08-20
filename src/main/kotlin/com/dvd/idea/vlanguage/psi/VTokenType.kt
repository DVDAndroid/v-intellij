package com.dvd.idea.vlanguage.psi

import com.dvd.idea.vlanguage.VLanguage
import com.intellij.psi.tree.IElementType

class VTokenType(debugName: String) : IElementType(debugName, VLanguage.INSTANCE) {

    override fun toString(): String = "VTokenType.${super.toString()}"

}