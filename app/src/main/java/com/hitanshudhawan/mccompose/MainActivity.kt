package com.hitanshudhawan.mccompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.hitanshudhawan.mccompose.ui.home.HomeScreen
import com.hitanshudhawan.mccompose.ui.menu.MenuScreen
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            McComposeTheme(lightTheme = true) {

                val navController = rememberNavController()

                NavHost(navController, startDestination = "home") {

                    composable("home") {
                        HomeScreen(
                            onCategoryClick = { navController.navigate("menu") },
                            onMenuItemClick = { navController.navigate("menu") },
                        )
                    }

                    composable("menu") {
                        MenuScreen(
                            onBackClick = { navController.navigateUp() }
                        )
                    }

                }

            }
        }
    }
}
