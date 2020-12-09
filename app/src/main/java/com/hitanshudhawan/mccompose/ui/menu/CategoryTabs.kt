package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.animation.ColorPropKey
import androidx.compose.animation.core.transitionDefinition
import androidx.compose.animation.transition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.data.CategoriesRepository
import com.hitanshudhawan.mccompose.model.Category
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme
import com.hitanshudhawan.mccompose.ui.theme.Red500
import com.hitanshudhawan.mccompose.ui.theme.Red700
import dev.chrisbanes.accompanist.coil.CoilImage
import kotlin.random.Random

@Composable
fun CategoryTabs(
    categories: List<Category>
) {
    ScrollableRow(
        modifier = Modifier.padding(vertical = 16.dp)
    ) {
        Spacer(modifier = Modifier.preferredWidth(16.dp))
        categories.forEach { category ->
            CategoryTab(
                category = category,
                selected = Random.nextBoolean(), // TODO : Just for testing!
                onClick = { /*todo*/ }
            )
            Spacer(modifier = Modifier.preferredWidth(16.dp))
        }
    }
}


private enum class CategoryTabState { Selected, NotSelected }

private val backgroundColor = ColorPropKey()
private val contentColor = ColorPropKey()

private val CategoryTabLightThemeTransitionDefinition = transitionDefinition<CategoryTabState> {
    state(CategoryTabState.Selected) {
        this[backgroundColor] = Red500
        this[contentColor] = Color.White
    }
    state(CategoryTabState.NotSelected) {
        this[backgroundColor] = Color.White
        this[contentColor] = Red500
    }
}

private val CategoryTabDarkThemeTransitionDefinition = transitionDefinition<CategoryTabState> {
    state(CategoryTabState.Selected) {
        this[backgroundColor] = Red700
        this[contentColor] = Color.Black
    }
    state(CategoryTabState.NotSelected) {
        this[backgroundColor] = Color.Black
        this[contentColor] = Red700
    }
}

@Composable
private fun CategoryTab(
    category: Category,
    selected: Boolean,
    onClick: () -> Unit
) {

    val isLightTheme = MaterialTheme.colors.isLight

    val categoryTabTransitionState = transition(
        definition = if (isLightTheme) CategoryTabLightThemeTransitionDefinition else CategoryTabDarkThemeTransitionDefinition,
        toState = if (selected) CategoryTabState.Selected else CategoryTabState.NotSelected
    )

    Surface(
        modifier = Modifier,
        shape = MaterialTheme.shapes.small,
        color = categoryTabTransitionState[backgroundColor],
        contentColor = categoryTabTransitionState[contentColor],
        border = BorderStroke(2.dp, if (isLightTheme) Red500 else Red700)
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoilImage(
                data = category.image,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .wrapContentWidth()
                    .preferredHeight(32.dp)
            )
            Spacer(modifier = Modifier.preferredWidth(8.dp))
            Text(
                text = category.name,
                style = MaterialTheme.typography.button
            )
        }
    }
}

@Preview("CategoryTabs")
@Composable
private fun CategoryTabsPreview() {
    McComposeTheme {
        CategoryTabs(
            categories = CategoriesRepository.getCategoriesData()
        )
    }
}

@Preview("CategoryTabs • Dark")
@Composable
private fun CategoryTabsDarkPreview() {
    McComposeTheme(lightTheme = false) {
        CategoryTabs(
            categories = CategoriesRepository.getCategoriesData()
        )
    }
}

@Preview("CategoryTab • Selected")
@Composable
private fun CategoryTabSelectedPreview() {
    McComposeTheme {
        CategoryTab(
            category = Category(
                id = 0,
                name = "Burgers",
                image = ""
            ),
            selected = true,
            onClick = {}
        )
    }
}

@Preview("CategoryTab • NotSelected")
@Composable
private fun CategoryTabNotSelectedPreview() {
    McComposeTheme {
        CategoryTab(
            category = Category(
                id = 0,
                name = "Burgers",
                image = ""
            ),
            selected = false,
            onClick = {}
        )
    }
}

@Preview("CategoryTab • Selected • Dark")
@Composable
private fun CategoryTabSelectedDarkPreview() {
    McComposeTheme(lightTheme = false) {
        CategoryTab(
            category = Category(
                id = 0,
                name = "Burgers",
                image = ""
            ),
            selected = true,
            onClick = {}
        )
    }
}

@Preview("CategoryTab • NotSelected • Dark")
@Composable
private fun CategoryTabNotSelectedDarkPreview() {
    McComposeTheme(lightTheme = false) {
        CategoryTab(
            category = Category(
                id = 0,
                name = "Burgers",
                image = ""
            ),
            selected = false,
            onClick = {}
        )
    }
}
