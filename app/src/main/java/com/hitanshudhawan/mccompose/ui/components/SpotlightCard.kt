package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Layout
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun SpotlightCard(
    imageUrl: String,
    title: String
) {

    val isLightTheme = MaterialTheme.colors.isLight

    Surface(
        modifier = Modifier.preferredWidth(160.dp),
        shape = MaterialTheme.shapes.medium,
        color = remember { getRandomBackgroundColor(isLightTheme) },
        contentColor = MaterialTheme.colors.onSurface
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = { /*todo*/ })
                .padding(vertical = 16.dp)
        ) {
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.preferredHeight(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.00f),
            ) {
                Layout(
                    children = {
                        CoilImage(
                            data = imageUrl,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .wrapContentWidth()
                                .fillMaxHeight()
                        )
                    }
                ) { measurables, constraints ->

                    val imagePlaceable = measurables[0].measure(constraints)

                    layout(
                        width = constraints.maxWidth,
                        height = constraints.minHeight
                    ) {
                        imagePlaceable.place(
                            x = (constraints.maxWidth - imagePlaceable.width * 0.75).toInt(),
                            y = 0
                        )
                    }
                }
            }
        }
    }
}

private fun getRandomBackgroundColor(isLightTheme: Boolean): Color {

    // List of light (50) and dark (700) colors
    val colors = listOf(
        Pair(Color(0xFFFCE4EC), Color(0xFFC2185B)), // Pink
        Pair(Color(0xFFF3E5F5), Color(0xFF7B1FA2)), // Purple
        Pair(Color(0xFFE1F5FE), Color(0xFF0288D1)), // Light Blue
        Pair(Color(0xFFF1F8E9), Color(0xFF689F38)), // Light Green
        Pair(Color(0xFFFFFDE7), Color(0xFFFBC02D)), // Yellow
    )

    val color = colors.random()
    return if (isLightTheme) color.first else color.second
}

@Preview("Spotlight Card")
@Composable
fun SpotlightCardPreview() {
    McComposeTheme {
        SpotlightCard(
            // todo : image in preview
            imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-Double-Quarter-Pounder-with-Cheese-Extra-Value-Meals.jpg",
            title = "Happy Meals"
        )
    }
}

@Preview("Spotlight Card • Dark")
@Composable
fun SpotlightCardDarkPreview() {
    McComposeTheme(lightTheme = false) {
        SpotlightCard(
            // todo : image in preview
            imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-Double-Quarter-Pounder-with-Cheese-Extra-Value-Meals.jpg",
            title = "Happy Meals"
        )
    }
}
