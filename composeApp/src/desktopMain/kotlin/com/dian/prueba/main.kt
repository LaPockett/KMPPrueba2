package com.dian.prueba

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinProjectPrueba2",
    ) {
        App()
    }
}