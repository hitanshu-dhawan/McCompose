package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.components.SpotlightCard

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color.White
            ) {
                Text(text = "Mc Donalds")
            }
        },
        backgroundColor = Color.LightGray
    ) {
        ScrollableColumn {
            Spacer(modifier = Modifier.preferredHeight(16.dp))
            ScrollableRow {
                Spacer(modifier = Modifier.preferredWidth(16.dp))
                repeat(6) { index ->
                    when (index) {
                        0 -> {
                            SpotlightCard(
                                imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-2-Cheeseburger-Extra-Value-Meals.jpg",
                                title = "Combo Meals",
                            )
                        }
                        1 -> {
                            SpotlightCard(
                                imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/assets/meal/desktop/h-mcdonalds-Hamburger.png",
                                title = "Happy Meals",
                            )
                        }
                        2 -> {
                            SpotlightCard(
                                imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-qpc-deluxe-burger.jpg",
                                title = "Burgers",
                            )
                        }
                        3 -> {
                            SpotlightCard(
                                imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-fries-medium.jpg",
                                title = "Fries",
                            )
                        }
                        5 -> {
                            SpotlightCard(
                                imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Vanilla-Reduced-Fat-Ice-Cream-Cone.jpg",
                                title = "Desserts",
                            )
                        }
                        4 -> {
                            SpotlightCard(
                                imageUrl = "https://www.mcdonalds.com/is/image/content/dam/usa/nfl/nutrition/items/hero/desktop/t-mcdonalds-Coca-Cola-Classic-Small.jpg",
                                title = "Beverages",
                            )
                        }
                    }
                    Spacer(modifier = Modifier.preferredWidth(16.dp))
                }
                //Spacer(modifier = Modifier.preferredWidth(16.dp))
            }
            Spacer(modifier = Modifier.preferredHeight(16.dp))
        }
    }
}

@Preview("HomeScreen")
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
