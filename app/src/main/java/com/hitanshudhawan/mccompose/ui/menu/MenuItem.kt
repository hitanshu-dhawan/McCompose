package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.ui.components.QuantityToggle
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun MenuItem(
    menuItem: MenuItem,
    onIncrementMenuItemQuantity: () -> Unit,
    onDecrementMenuItemQuantity: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onSurface
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = {})
                .padding(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .preferredSize(120.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colors.surface),
                alignment = Alignment.Center
            ) {
                CoilImage(
                    data = menuItem.image,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1.40f)
                )
            }
            Spacer(modifier = Modifier.preferredWidth(8.dp))
            Column {
                Text(
                    text = menuItem.name,
                    style = MaterialTheme.typography.subtitle1
                )
                Text(
                    text = menuItem.description,
                    style = MaterialTheme.typography.body2,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.preferredHeight(4.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$" + "%.2f".format(menuItem.price),
                        style = MaterialTheme.typography.subtitle2
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    QuantityToggle(
                        quantity = menuItem.quantity,
                        onIncrementQuantity = onIncrementMenuItemQuantity,
                        onDecrementQuantity = onDecrementMenuItemQuantity,
                    )
                }
            }
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
                id = 0,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                price = 0.00,
                categoryId = 0
            ),
            onIncrementMenuItemQuantity = {},
            onDecrementMenuItemQuantity = {},
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
                id = 0,
                name = "Double Quarter Pounder with Cheese Meal",
                description = "Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                image = "https://raw.githubusercontent.com/DumbPolyglotProgrammer/PigGame/master/images/" + "menu_item_double_quarter_pounder_with_cheese_meal.png",
                price = 0.00,
                categoryId = 0
            ),
            onIncrementMenuItemQuantity = {},
            onDecrementMenuItemQuantity = {},
        )
    }
}
