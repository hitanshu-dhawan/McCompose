package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.Box
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun MenuItemCard(
    menuItem: MenuItem,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
    ) {
        // TODO ...
    }
}

@Preview("Menu Item Card")
@Composable
fun MenuItemCardPreview() {
    McComposeTheme {
        // todo : image in preview
        MenuItemCard(
            menuItem = MenuItem(
                id = 4004,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                price = 0.00,
                categoryId = 4
            )
        )
    }
}

@Preview("Menu Item Card • Dark")
@Composable
fun MenuItemCardDarkPreview() {
    McComposeTheme(lightTheme = false) {
        // todo : image in preview
        MenuItemCard(
            menuItem = MenuItem(
                id = 4004,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                price = 0.00,
                categoryId = 4
            )
        )
    }
}
