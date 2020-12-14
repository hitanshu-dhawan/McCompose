package com.hitanshudhawan.mccompose.ui.home

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.data.HomeRepository
import com.hitanshudhawan.mccompose.ui.components.SearchBar
import com.hitanshudhawan.mccompose.ui.components.SpotlightCard
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun HomeScreen(
    onCategoryClick: () -> Unit,
    onMenuItemClick: () -> Unit,
) {

    val data = HomeRepository.getHomeData()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "McDonald's") }
            )
        }
    ) {
        ScrollableColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "Hi ${data.user.name}!",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            SearchBar(
                text = "Find what you want...",
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            ScrollableRow {
                Spacer(modifier = Modifier.preferredWidth(16.dp))
                data.categories.forEach { category ->
                    SpotlightCard(
                        title = category.name,
                        imageUrl = category.image,
                        onClick = onCategoryClick
                    )
                    Spacer(modifier = Modifier.preferredWidth(16.dp))
                }
            }

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "Popular",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            data.popularMenuItems.forEach { menuItem ->
                MenuItemCard(
                    menuItem = menuItem,
                    onClick = onMenuItemClick
                )
                Spacer(modifier = Modifier.preferredHeight(8.dp))
            }

            Spacer(modifier = Modifier.preferredHeight(16.dp))

            Text(
                text = "Recommended",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            data.recommendedMenuItems.forEach { menuItem ->
                MenuItemCard(
                    menuItem = menuItem,
                    onClick = onMenuItemClick
                )
                Spacer(modifier = Modifier.preferredHeight(8.dp))
            }

            Spacer(modifier = Modifier.preferredHeight(16.dp))
        }
    }
}

@Preview("HomeScreen")
@Composable
private fun HomeScreenPreview() {
    McComposeTheme {
        HomeScreen(
            onCategoryClick = {},
            onMenuItemClick = {},
        )
    }
}

@Preview("HomeScreen • Dark")
@Composable
private fun HomeScreenDarkPreview() {
    McComposeTheme(lightTheme = false) {
        HomeScreen(
            onCategoryClick = {},
            onMenuItemClick = {},
        )
    }
}