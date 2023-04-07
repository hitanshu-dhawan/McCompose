package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

@Composable
fun SearchBar(
    text: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        color = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = {})
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomIcon(Icons.Rounded.Search)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.titleSmall.copy(fontWeight = FontWeight.Normal)
            )
        }
    }
}

@Preview("SearchBar")
@Composable
private fun SearchBarPreview() {
    McComposeTheme {
        SearchBar(
            text = "Find what you want..."
        )
    }
}

@Preview("SearchBar • Dark")
@Composable
private fun SearchBarDarkPreview() {
    McComposeTheme(lightTheme = false) {
        SearchBar(
            text = "Find what you want..."
        )
    }
}
