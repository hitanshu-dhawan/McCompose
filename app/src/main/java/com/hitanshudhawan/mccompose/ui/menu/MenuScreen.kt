package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.viewModel
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun MenuScreen(
    onBackClick: () -> Unit
) {

    val viewModel: MenuViewModel = viewModel()

    val data by viewModel.data.observeAsState(Menu(emptyList(), emptyList()))

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "McDonald's Menu") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(asset = Icons.Rounded.ArrowBack)
                    }
                }
            )
        }
    ) {
        Box {

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

            if (data.menuItems.any { it.quantity != 0 }) {
                MenuCartButton(
                    quantity = data.menuItems.sumOf { it.quantity },
                    price = data.menuItems.sumOf { it.price },
                    onClick = {},
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.BottomCenter)
                )
            }

        }
    }
}

@Preview("MenuScreen")
@Composable
private fun MenuScreenPreview() {
    McComposeTheme {
        MenuScreen(
            onBackClick = {}
        )
    }
}

@Preview("MenuScreen • Dark")
@Composable
private fun MenuScreenDarkPreview() {
    McComposeTheme(lightTheme = false) {
        MenuScreen(
            onBackClick = {}
        )
    }
}