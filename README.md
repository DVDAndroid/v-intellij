# IntelliJ V Plugin

A plugin that adds [V](http://vlang.io) support for the IntelliJ Platform IDEs.

## Features

* ![done](https://img.shields.io/badge/status-done-success) Commenter `CTRL + /`
* ![done](https://img.shields.io/badge/status-done-success) Brace matcher
* ![not complete](https://img.shields.io/badge/status-partial-orange) Run configuration & SDK configuration
* ![not complete](https://img.shields.io/badge/status-partial-orange) Basic Syntax Validation and Highlighting
* ![not started](https://img.shields.io/badge/status-not%20started-red) Autocompletion `CTRL + Space`
* ![not started](https://img.shields.io/badge/status-not%20started-red) Folding
* ![not started](https://img.shields.io/badge/status-not%20started-red) Formatter `CTRL + SHIFT + L`
* ![not started](https://img.shields.io/badge/status-not%20started-red) References
* ![not started](https://img.shields.io/badge/status-not%20started-red) Find Usages `ALT + f7`
* ![not started](https://img.shields.io/badge/status-not%20started-red) Structure View
* ![not started](https://img.shields.io/badge/status-not%20started-red) Helpers and Utilities
* ![not started](https://img.shields.io/badge/status-not%20started-red) Templates
* ![not started](https://img.shields.io/badge/status-not%20planned-lightgray) Error Messages
* ![not started](https://img.shields.io/badge/status-not%20planned-lightgray) Quick Fix `ALT + ENTER`
 
## Development

1. Clone project `git clone https://github.com/dvdandroid/v-intellij`
2. Open project with IntelliJ IDEA
    1. Install [GrammarKit](https://github.com/JetBrains/Grammar-Kit) plugin if you need to edit `.bnf` file
3. Run with Gradle `runIde` or `buildPlugin` task