package com.dvd.idea.vlanguage.editor

import com.intellij.lang.Commenter

class VCommenter : Commenter {

    override fun getLineCommentPrefix(): String? = "//"

    override fun getBlockCommentPrefix(): String? = null

    override fun getBlockCommentSuffix(): String? = null

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null

}