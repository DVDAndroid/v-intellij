package com.dvd.idea.vlanguage.settings

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.BoundConfigurable
import com.intellij.openapi.options.SearchableConfigurable
import com.intellij.openapi.ui.DialogPanel
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.layout.panel

class VSettingsConfigurable : BoundConfigurable("V interpreter"), SearchableConfigurable {

    companion object {
        const val ID = "preference.VSettingsConfigurable"
    }

    override fun getId(): String = ID

    override fun createPanel(): DialogPanel = panel {
        row {
            label("V interpreter:")
            TextFieldWithBrowseButton().apply {
                addBrowseFolderListener(
                    "Choose interpreter path",
                    null,
                    null,
                    FileChooserDescriptorFactory.createSingleLocalFileDescriptor()
                )
            }()
        }
    }
}