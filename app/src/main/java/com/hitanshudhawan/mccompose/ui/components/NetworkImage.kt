package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun NetworkImage(
    imageUrl: String,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Fit,
    fadeIn: Boolean = true,
) {
    Image(
        painter = rememberCoilPainter(
            imageUrl,
            fadeIn = fadeIn
        ),
        contentDescription = null,
        modifier = modifier,
        contentScale = contentScale,
    )
}
