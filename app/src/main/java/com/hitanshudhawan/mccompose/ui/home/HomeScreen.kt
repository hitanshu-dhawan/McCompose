package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.components.SpotlightCard

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "McDonald's") }
            )
        },
        backgroundColor = Color(0xFFEEEEEE) // todo : theme color or something
    ) {

        val horizontalPadding = 16.dp

        ScrollableColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "Hello Hitanshu!", // todo : make this name bold.
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(horizontal = horizontalPadding)
            )

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            // Search Bar
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = horizontalPadding)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .padding(16.dp)
                        .gravity(Alignment.CenterHorizontally)
                ) {
                    Icon(
                        asset = Icons.Default.Search
                    )
                    Spacer(modifier = Modifier.preferredWidth(8.dp))
                    Text(
                        text = "Find what you want...",
                        style = MaterialTheme.typography.subtitle1
                    )
                }
            }

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            // Spotlight Cards
            ScrollableRow {
                Spacer(modifier = Modifier.preferredWidth(horizontalPadding))
                items.forEach { item ->
                    SpotlightCard(
                        imageUrl = item.imageUrl,
                        title = item.title
                    )
                    Spacer(modifier = Modifier.preferredWidth(horizontalPadding))
                }
            }

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "Recommended",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(horizontal = horizontalPadding)
            )

            // ...
        }

    }
}

private data class Data(val imageUrl: String, val title: String)

private val items = listOf(
    Data(
        imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg",
        title = "Combo Meals"
    ),
    Data(
        imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-Hamburger.png",
        title = "Happy Meals",
    ),
    Data(
        imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-qpc-deluxe-burger.jpg",
        title = "Burgers",
    ),
    Data(
        imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-fries-medium.jpg",
        title = "Fries",
    ),
    Data(
        imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Vanilla-Reduced-Fat-Ice-Cream-Cone.jpg",
        title = "Desserts",
    ),
    Data(
        imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Coca-Cola-Classic-Small.jpg",
        title = "Beverages",
    ),
)

@Preview("HomeScreen")
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
