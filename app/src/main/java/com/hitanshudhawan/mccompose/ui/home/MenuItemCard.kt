package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.R
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.ui.components.NetworkImage
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun MenuItemCard(
    menuItem: MenuItem,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp),
        color = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {

            // Card
            Surface(
                modifier = Modifier
                    .padding(16.dp),
                shape = MaterialTheme.shapes.medium
            ) {
                Row(modifier = Modifier.clickable(onClick = onClick)) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .weight(0.6f)
                    ) {
                        Text(
                            text = menuItem.name,
                            style = MaterialTheme.typography.titleSmall,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier

                        )

                        Text(
                            text = "$" + "%.2f".format(menuItem.price),
                            style = MaterialTheme.typography.titleSmall,
                            modifier = Modifier

                        )
                    }

                    NetworkImage(
                        imageUrl = menuItem.image,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(1.4f),
                        previewPlaceholder = R.drawable.menu_item_double_quarter_pounder_with_cheese_meal
                    )
                }
            }


    }
}

@Preview("Menu Item Card")
@Composable
private fun MenuItemCardPreview() {
    McComposeTheme {
        MenuItemCard(
            menuItem = MenuItem(
                id = 0,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "",
                image = "",
                price = 0.00,
                categoryId = 0
            ),
            onClick = {}
        )
    }
}

@Preview("Menu Item Card • Dark")
@Composable
private fun MenuItemCardDarkPreview() {
    McComposeTheme(lightTheme = false) {
        MenuItemCard(
            menuItem = MenuItem(
                id = 0,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "",
                image = "",
                price = 0.00,
                categoryId = 0
            ),
            onClick = {}
        )
    }
}
