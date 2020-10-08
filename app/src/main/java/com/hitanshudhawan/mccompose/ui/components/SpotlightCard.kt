package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
    Surface(
        modifier = Modifier.preferredWidth(170.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Column(
            modifier = Modifier
                .clickable(onClick = { /*todo*/ })
                .fillMaxWidth()
                .padding(vertical = 32.dp),
            horizontalGravity = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.75f),
            ) {
                CoilImage(
                    data = imageUrl,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize(),
                )
            }
            Spacer(modifier = Modifier.preferredHeight(16.dp))
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = MaterialTheme.typography.h6,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
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
