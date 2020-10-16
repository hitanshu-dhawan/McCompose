package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun SearchBar(
    text: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = { /*todo*/ })
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(asset = Icons.Default.Search)
            Spacer(modifier = Modifier.preferredWidth(8.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.subtitle1
            )
            // TODO : Fix tint of icon and text, by contentColor or onPrimary/onSurface from Theme
            // TODO : MaterialTheme.colors.onSurface.copy(alpha = 0.1f)
        }
    }
}

@Preview("SearchBar")
@Composable
fun SearchBarPreview() {
    McComposeTheme {
        SearchBar(
            text = "Find what you want..."
        )
    }
}

@Preview("SearchBar • Dark")
@Composable
fun SearchBarDarkPreview() {
    McComposeTheme(lightTheme = false) {
        SearchBar(
            text = "Find what you want..."
        )
    }
}
