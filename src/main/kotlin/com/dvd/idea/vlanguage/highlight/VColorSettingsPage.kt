package com.dvd.idea.vlanguage.highlight

import com.dvd.idea.vlanguage.VLanguage
import com.dvd.idea.vlanguage.icons.VIcons
import com.dvd.idea.vlanguage.util.attributesDescriptors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class VColorSettingsPage : ColorSettingsPage {

    override fun getHighlighter(): SyntaxHighlighter = VSyntaxHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? = null

    override fun getIcon(): Icon? = VIcons.FILE

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = attributesDescriptors {
        descriptor {
            displayName = "Comment"
            attrKey = VSyntaxHighlighter.COMMENT
        }
        descriptor {
            displayName = "Keyword"
            attrKey = VSyntaxHighlighter.KEYWORD
        }
        descriptors("Braces and Operators") {
            descriptor {
                displayName = "Parenthesis"
                attrKey = VSyntaxHighlighter.PARENTHS
            }
            descriptor {
                displayName = "Braces"
                attrKey = VSyntaxHighlighter.BRACES
            }
            descriptor {
                displayName = "Brackets"
                attrKey = VSyntaxHighlighter.BRACKETS
            }
            descriptor {
                displayName = "Operators"
                attrKey = VSyntaxHighlighter.OPERATORS
            }
        }
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = VLanguage.INSTANCE.displayName

    override fun getDemoText(): String = """/* Block comment */
module main // line comment

import os"""
}