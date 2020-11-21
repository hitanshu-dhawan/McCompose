package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.viewinterop.viewModel
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun MenuScreen(
    viewModel: MenuViewModel = viewModel()
) {

    val data by viewModel.data.observeAsState(Menu(emptyList(), emptyList()))

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "McDonald's Menu") }
            )
        }
    ) {

        LazyColumnFor(
            items = data.menuItems
        ) { menuItem ->
            MenuItem(
                menuItem = menuItem,
                onIncrementMenuItemQuantity = { viewModel.incrementMenuItemQuantity(menuItem) },
                onDecrementMenuItemQuantity = { viewModel.decrementMenuItemQuantity(menuItem) },
            )
            Divider()
        }

    }
}

@Preview("MenuScreen")
@Composable
private fun MenuScreenPreview() {
    McComposeTheme {
        MenuScreen()
    }
}

@Preview("MenuScreen • Dark")
@Composable
private fun MenuScreenDarkPreview() {
    McComposeTheme(lightTheme = false) {
        MenuScreen()
    }
}