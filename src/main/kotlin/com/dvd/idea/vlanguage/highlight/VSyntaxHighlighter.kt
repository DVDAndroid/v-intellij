package com.dvd.idea.vlanguage.highlight

import com.dvd.idea.vlanguage.parser.VLexerAdapter
import com.dvd.idea.vlanguage.psi.VElementTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

class VSyntaxHighlighter : SyntaxHighlighterBase() {

    companion object {
        val KEYWORD = createTextAttributesKey("V_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val NUMBER = createTextAttributesKey("V_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val STRING = createTextAttributesKey("V_STRING", DefaultLanguageHighlighterColors.STRING)
        val COMMA = createTextAttributesKey("V_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val DOT = createTextAttributesKey("V_DOT", DefaultLanguageHighlighterColors.DOT)
        val SEMICOLON = createTextAttributesKey("V_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON)
        val OPERATORS = createTextAttributesKey("V_OPERATORS", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val COMMENT = createTextAttributesKey("V_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val PARENTHS = createTextAttributesKey("V_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACES = createTextAttributesKey("V_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val BRACKETS = createTextAttributesKey("V_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)

        private val ATTRIBUTES = hashMapOf<IElementType, TextAttributesKey>(
            VElementTypes.V_IMPORT to KEYWORD,
            VElementTypes.V_MODULE to KEYWORD,
            VElementTypes.V_CONST to KEYWORD,
            VElementTypes.V_INTERFACE to KEYWORD,
            VElementTypes.V_FN to KEYWORD,
            VElementTypes.V_ENUM to KEYWORD,
            VElementTypes.V_STRUCT to KEYWORD,
            VElementTypes.V_IF to KEYWORD,
            VElementTypes.V_SWITCH to KEYWORD,
            VElementTypes.V_CASE to KEYWORD,
            VElementTypes.V_ELSE to KEYWORD,
            VElementTypes.V_FOR to KEYWORD,
            VElementTypes.V_DEFAULT to KEYWORD,
            VElementTypes.V_RETURN to KEYWORD,

            VElementTypes.V_LPAREN to PARENTHS,
            VElementTypes.V_RPAREN to PARENTHS,
            VElementTypes.V_LBRACE to BRACES,
            VElementTypes.V_RBRACE to BRACES,
            VElementTypes.V_LBRACK to BRACKETS,
            VElementTypes.V_RBRACK to BRACKETS,

            VElementTypes.V_PLUS to OPERATORS,
            VElementTypes.V_PLUS_PLUS to OPERATORS,
            VElementTypes.V_PLUS_ASSIGN to OPERATORS,
            VElementTypes.V_MINUS to OPERATORS,
            VElementTypes.V_MINUS_MINUS to OPERATORS,
            VElementTypes.V_MINUS_ASSIGN to OPERATORS,
            VElementTypes.V_QUOTIENT to OPERATORS,
            VElementTypes.V_QUOTIENT_ASSIGN to OPERATORS,
            VElementTypes.V_MUL to OPERATORS,
            VElementTypes.V_MUL_ASSIGN to OPERATORS,
            VElementTypes.V_REMAINDER to OPERATORS,
            VElementTypes.V_REMAINDER_ASSIGN to OPERATORS,
            VElementTypes.V_BIT_AND to OPERATORS,
            VElementTypes.V_BIT_AND_ASSIGN to OPERATORS,
            VElementTypes.V_BIT_OR to OPERATORS,
            VElementTypes.V_BIT_OR_ASSIGN to OPERATORS,
            VElementTypes.V_BIT_XOR to OPERATORS,
            VElementTypes.V_BIT_XOR_ASSIGN to OPERATORS,
            VElementTypes.V_LESS to OPERATORS,
            VElementTypes.V_LESS_OR_EQUAL to OPERATORS,
            VElementTypes.V_GREATER to OPERATORS,
            VElementTypes.V_GREATER_OR_EQUAL to OPERATORS,
            VElementTypes.V_EQ to OPERATORS,
            VElementTypes.V_NOT_EQ to OPERATORS,
            VElementTypes.V_SHIFT_LEFT to OPERATORS,
            VElementTypes.V_SHIFT_LEFT_ASSIGN to OPERATORS,
            VElementTypes.V_SHIFT_RIGHT to OPERATORS,
            VElementTypes.V_SHIFT_RIGHT_ASSIGN to OPERATORS,

            VElementTypes.V_DOT to DOT,
            VElementTypes.V_TRIPLE_DOT to DOT,
            VElementTypes.V_COMMA to COMMA,
            VElementTypes.V_SEMICOLON to SEMICOLON,

            VElementTypes.V_NUMBER to NUMBER,
            VElementTypes.V_STRING to NUMBER,

            VElementTypes.V_COMMENT to COMMENT
        )
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> = pack(ATTRIBUTES[tokenType])

    override fun getHighlightingLexer(): Lexer = VLexerAdapter()
}