package com.hitanshudhawan.mccompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.Crossfade
import androidx.compose.runtime.savedinstancestate.savedInstanceState
import androidx.compose.ui.platform.setContent
import com.hitanshudhawan.mccompose.ui.home.HomeScreen
import com.hitanshudhawan.mccompose.ui.menu.MenuScreen
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            McComposeTheme(lightTheme = true) {

                val (currentScreen, setCurrentScreen) = savedInstanceState { 0 } // TODO : use enum or sealed class here, look at compose samples...

                Crossfade(currentScreen) { screen ->
                    when (screen) {
                        0 -> HomeScreen(
                            onCategoryClick = { setCurrentScreen(1) },
                            onMenuItemClick = { setCurrentScreen(1) },
                        )
                        1 -> MenuScreen()
                    }
                }

            }
        }
    }
}
