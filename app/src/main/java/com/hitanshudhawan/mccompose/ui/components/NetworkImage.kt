package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun NetworkImage(
    imageUrl: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    fadeIn: Boolean = true,
) {
    CoilImage(
        data = imageUrl,
        contentScale = contentScale,
        modifier = modifier,
        fadeIn = fadeIn,
    )
}
