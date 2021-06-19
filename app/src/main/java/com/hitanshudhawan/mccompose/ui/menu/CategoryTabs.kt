package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.R
import com.hitanshudhawan.mccompose.data.CategoriesRepository
import com.hitanshudhawan.mccompose.model.Category
import com.hitanshudhawan.mccompose.ui.components.NetworkImage
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun CategoryTabs(
    categories: List<Category>,
    selectedCategory: Category,
    onCategorySelected: (Category) -> Unit
) {
    ScrollableTabRow(
        selectedTabIndex = categories.indexOf(selectedCategory),
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onSurface,
        edgePadding = 8.dp,
        indicator = {},
        divider = {}
    ) {
        categories.forEach { category ->
            CategoryTab(
                category = category,
                selected = category == selectedCategory,
                onClick = { onCategorySelected(category) },
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 16.dp)
            )
        }
    }
}


private enum class CategoryTabState { Selected, NotSelected }

@Composable
private fun CategoryTab(
    category: Category,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    val transition = updateTransition(if (selected) CategoryTabState.Selected else CategoryTabState.NotSelected)

    val backgroundColor by transition.animateColor { state ->
        when (state) {
            CategoryTabState.Selected -> MaterialTheme.colors.primary
            CategoryTabState.NotSelected -> MaterialTheme.colors.background
        }
    }
    val contentColor by transition.animateColor { state ->
        when (state) {
            CategoryTabState.Selected -> LocalContentColor.current
            CategoryTabState.NotSelected -> MaterialTheme.colors.primary
        }
    }

    Surface(
        modifier = modifier,
        shape = MaterialTheme.shapes.small,
        color = backgroundColor,
        contentColor = contentColor,
        border = BorderStroke(2.dp, MaterialTheme.colors.primary)
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = onClick)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NetworkImage(
                imageUrl = category.image,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .wrapContentWidth()
                    .height(32.dp),
                previewPlaceholder = R.drawable.category_burgers
            )
            Spacer(modifier = Modifier.width(8.dp))
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
            categories = CategoriesRepository.getCategoriesData(),
            selectedCategory = CategoriesRepository.getCategoriesData().first(),
            onCategorySelected = {}
        )
    }
}

@Preview("CategoryTabs • Dark")
@Composable
private fun CategoryTabsDarkPreview() {
    McComposeTheme(lightTheme = false) {
        CategoryTabs(
            categories = CategoriesRepository.getCategoriesData(),
            selectedCategory = CategoriesRepository.getCategoriesData().first(),
            onCategorySelected = {}
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
