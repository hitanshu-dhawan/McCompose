package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.ui.components.QuantityStepper
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme
import dev.chrisbanes.accompanist.coil.CoilImage

// TODO : Change this design...

@Composable
fun MenuItem(
    menuItem: MenuItem,
    onIncrement: () -> Unit,
    onDecrement: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth()
    ) {

        Row {

            CoilImage(
                data = menuItem.image,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .preferredSize(80.dp)
                    .aspectRatio(1.00f)
            )

            Text(
                text = menuItem.name,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Medium, fontSize = 18.sp), // TODO : fix typography theme
                modifier = Modifier
                    .weight(1f)
            )

            QuantityStepper(
                count = menuItem.quantity,
                onIncrement = onIncrement,
                onDecrement = onDecrement,
                text = "ADD",
                primaryColor = Color(0xff304ffe),
                secondaryColor = Color(0xfff0f0f0)
            )

        }

    }
}

@Preview("Menu Item Card")
@Composable
fun MenuCardPreview() {
    McComposeTheme {
        // todo : image in preview
        MenuItem(
            menuItem = MenuItem(
                id = 4004,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                price = 0.00,
                categoryId = 4
            ),
            onIncrement = {},
            onDecrement = {},
        )
    }
}

@Preview("Menu Item Card • Dark")
@Composable
fun MenuItemDarkPreview() {
    McComposeTheme(lightTheme = false) {
        // todo : image in preview
        MenuItem(
            menuItem = MenuItem(
                id = 4004,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                price = 0.00,
                categoryId = 4
            ),
            onIncrement = {},
            onDecrement = {},
        )
    }
}
