package com.hitanshudhawan.mccompose.ui.details

import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.components.Icon
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun DetailsScreen(
    menuItemId: Long,
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "McDonald's Details") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.Rounded.ArrowBack)
                    }
                }
            )
        }
    ) {
        //...
    }
}

@Preview("DetailsScreen")
@Composable
private fun DetailsScreenPreview() {
    McComposeTheme {
        DetailsScreen(
            menuItemId = 0,
            onBackClick = {}
        )
    }
}

@Preview("DetailsScreen • Dark")
@Composable
private fun DetailsScreenDarkPreview() {
    McComposeTheme(lightTheme = false) {
        DetailsScreen(
            menuItemId = 0,
            onBackClick = {}
        )
    }
}
