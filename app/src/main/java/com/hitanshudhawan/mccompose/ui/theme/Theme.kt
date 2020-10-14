package com.hitanshudhawan.mccompose.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColors(
    primary = Red500,
    primaryVariant = Red700,
    // TODO : secondary color, if required. also change in themes.xml
    background = Color.White,
    surface = Gray100,
)

private val DarkThemeColors = darkColors(
    primary = Red200,
    primaryVariant = Red700,
    // TODO : secondary color, if required. also change in themes.xml
    background = Color.Black,
    surface = Gray900,
)

@Composable
fun McComposeTheme(
    lightTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (lightTheme) LightThemeColors else DarkThemeColors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
