package com.hitanshudhawan.mccompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.hitanshudhawan.mccompose.ui.home.HomeScreen
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            McComposeTheme(lightTheme = true) {
                HomeScreen()
            }
        }
    }
}
