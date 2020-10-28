package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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

        // TODO...

        LazyColumnFor(
            items = data.menuItems
        ) { menuItem ->
            MenuItem(
                menuItem = menuItem,
                onIncrement = { viewModel.incrementMenuItemQuantity(menuItem) },
                onDecrement = { viewModel.decrementMenuItemQuantity(menuItem) },
                modifier = Modifier.padding(16.dp)
            )
        }

    }
}

@Preview("MenuScreen")
@Composable
fun MenuScreenPreview() {
    McComposeTheme {
        MenuScreen()
    }
}

@Preview("MenuScreen • Dark")
@Composable
fun MenuScreenDarkPreview() {
    McComposeTheme(lightTheme = false) {
        MenuScreen()
    }
}