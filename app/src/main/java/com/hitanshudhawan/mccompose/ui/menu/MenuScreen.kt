package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.*
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.data.MenuRepository
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun MenuScreen(
    // ...
) {

    val data = MenuRepository.getMenuData()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "McDonald's Menu") }
            )
        }
    ) {

        // TODO...

        Text(text = "Hello ${data.menuItems.random().name}!")

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