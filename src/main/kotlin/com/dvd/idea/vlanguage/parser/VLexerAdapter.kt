package com.dvd.idea.vlanguage.parser

import com.dvd.idea.vlanguage._VLexer
import com.intellij.lexer.FlexAdapter

class VLexerAdapter : FlexAdapter(_VLexer(null))