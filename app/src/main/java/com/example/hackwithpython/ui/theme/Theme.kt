package com.example.hackwithpython.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(11, 91, 21),
    secondary = Color(0, 0, 0),
    tertiary = Color(233, 245, 219)
)


@Composable
fun HackWithPythonTheme(
    darkTheme: ColorScheme = DarkColorScheme,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = darkTheme,
        typography = Typography,
        content = content
    )
}