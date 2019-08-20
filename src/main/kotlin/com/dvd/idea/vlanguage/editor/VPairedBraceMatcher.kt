package com.dvd.idea.vlanguage.editor

import com.dvd.idea.vlanguage.psi.VElementTypes
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class VPairedBraceMatcher : PairedBraceMatcher {

    companion object {
        private val BRACE_PAIRS = arrayOf(
            BracePair(VElementTypes.V_LBRACE, VElementTypes.V_RBRACE, true),
            BracePair(VElementTypes.V_LBRACK, VElementTypes.V_RBRACK, true),
            BracePair(VElementTypes.V_LPAREN, VElementTypes.V_RPAREN, true)
        )
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean = true

    override fun getPairs(): Array<BracePair> = BRACE_PAIRS
}