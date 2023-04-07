package com.hitanshudhawan.mccompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColorScheme(
    primary = Red500,
    secondary = Amber500,
    background = Color.White,
    surface = Gray100
)

private val DarkThemeColors = darkColorScheme(
    primary = Red700,
    secondary = Amber700,
    background = Color.Black,
    surface = Gray900
)

@Composable
fun McComposeTheme(
    lightTheme: Boolean = !isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (lightTheme) LightThemeColors else DarkThemeColors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
