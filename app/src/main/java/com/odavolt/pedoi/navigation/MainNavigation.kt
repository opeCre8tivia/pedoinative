package com.odavolt.pedoi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.odavolt.pedoi.screens.AuthNavigationScreen
import com.odavolt.pedoi.screens.PedoiSplashScreen
import com.odavolt.pedoi.utils.ScreenNames


// --> controller -> nav host -> nav graph
@Composable
fun MainNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenNames.PedoiSplashScreen.name ){
        /**
         * in this main navigation, we shall be in position to move to 4  major navigation points
         * 1 - splash screen
         * 2- auth nav screen
         * 3 - farmers Nav screen
         * 4 - investors nav screen
         *
         * ***/

        composable(route = ScreenNames.PedoiSplashScreen.name){
            PedoiSplashScreen(navController = navController)
        }

        composable(route = ScreenNames.AuthNavigationScreen.name){
            AuthNavigationScreen(navController = navController)
        }
    }

}