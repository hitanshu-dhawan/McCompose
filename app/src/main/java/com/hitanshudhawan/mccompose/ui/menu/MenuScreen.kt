package com.hitanshudhawan.mccompose.ui.menu

import androidx.compose.foundation.*
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.data.MenuRepository
import com.hitanshudhawan.mccompose.ui.components.QuantityStepper
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

        ScrollableColumn {

            Text(text = "Hello ${data.menuItems.random().name}!")

            data.menuItems.forEachIndexed { index, _ ->
                QuantityStepper(
                    count = index,
                    onIncrement = {},
                    onDecrement = {},
                    text = "ADD",
                    primaryColor = Color(0xff304ffe),
                    secondaryColor = Color(0xfff0f0f0)
                )
            }

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