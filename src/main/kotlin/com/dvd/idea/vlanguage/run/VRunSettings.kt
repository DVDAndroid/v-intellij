package com.dvd.idea.vlanguage.run

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.layout.panel
import javax.swing.JComponent

class VRunSettings : SettingsEditor<VRunConfiguration>() {

    override fun createEditor(): JComponent {
        return panel {
            row {
                label("V script file: ")
                TextFieldWithBrowseButton().apply {
                    addBrowseFolderListener(
                        "V script file",
                        null,
                        null,
                        FileChooserDescriptorFactory.createSingleLocalFileDescriptor()
                    )
                }()
            }
        }
    }

    override fun applyEditorTo(s: VRunConfiguration) {
    }

    override fun resetEditorFrom(s: VRunConfiguration) {
    }

}
