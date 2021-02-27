package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
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
        color = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onSurface
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxSize()
        ) {

            val (card, name, price, image) = createRefs()

            // Card
            Surface(
                modifier = Modifier
                    .constrainAs(card) {
                        start.linkTo(parent.start, margin = 16.dp)
                        end.linkTo(parent.end, margin = 16.dp)
                        top.linkTo(parent.top, margin = 32.dp)
                        bottom.linkTo(parent.bottom)

                        width = Dimension.fillToConstraints
                        height = Dimension.fillToConstraints
                    },
                shape = MaterialTheme.shapes.medium
            ) {
                Row(modifier = Modifier.clickable(onClick = onClick)) {}
            }

            Text(
                text = menuItem.name,
                style = MaterialTheme.typography.subtitle1,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .constrainAs(name) {
                        start.linkTo(card.start, margin = 16.dp)
                        end.linkTo(image.start)
                        top.linkTo(card.top, margin = 16.dp)

                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    }
            )

            Text(
                text = "$" + "%.2f".format(menuItem.price),
                style = MaterialTheme.typography.subtitle2,
                modifier = Modifier
                    .constrainAs(price) {
                        start.linkTo(card.start, margin = 16.dp)
                        end.linkTo(image.start)
                        bottom.linkTo(card.bottom, margin = 16.dp)

                        width = Dimension.fillToConstraints
                        height = Dimension.wrapContent
                    }
            )

            NetworkImage(
                imageUrl = menuItem.image,
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
