package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun MenuItemCard(
    menuItem: MenuItem
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .preferredHeight(160.dp),
        color = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onSurface
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {

            val (card, name, image) = createRefs()

            // Card
            Surface(
                modifier = Modifier
                    .constrainAs(card) {
                        start.linkTo(parent.start, margin = 16.dp) // todo : 16 dp get from outside or global horizontal padding
                        end.linkTo(parent.end, margin = 16.dp) // todo : 16 dp get from outside or global horizontal padding
                        top.linkTo(parent.top, margin = 32.dp)
                        bottom.linkTo(parent.bottom)

                        width = Dimension.fillToConstraints
                        height = Dimension.fillToConstraints
                    },
                shape = MaterialTheme.shapes.medium
            ) {
                Row(modifier = Modifier.clickable(onClick = { /*todo*/ })) {}
            }

            Text(
                text = menuItem.name,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Medium, fontSize = 18.sp), // TODO : fix typography theme
                modifier = Modifier
                    .constrainAs(name) {
                        start.linkTo(card.start, margin = 24.dp)
                        end.linkTo(image.start)
                        top.linkTo(card.top)
                        bottom.linkTo(card.bottom)

                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    }
            )

            CoilImage(
                data = menuItem.image,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1.40f)
                    .constrainAs(image) {
                        end.linkTo(parent.end)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    }
            )

        }
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
