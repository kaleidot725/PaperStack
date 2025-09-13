package jp.kaleidot725.paperstack.paperstack

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "paperstack",
    ) {
        App()
    }
}