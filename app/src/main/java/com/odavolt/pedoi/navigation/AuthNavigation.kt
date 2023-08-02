package com.odavolt.pedoi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.odavolt.pedoi.screens.AccountTypeSelectionScreen
import com.odavolt.pedoi.screens.FarmerNavigationScreen
import com.odavolt.pedoi.screens.LoginScreen
import com.odavolt.pedoi.screens.RegisterScreen
import com.odavolt.pedoi.utils.ScreenNames


@Composable
fun AuthNavigation(){
    val authNavigationController = rememberNavController()
    NavHost(navController = authNavigationController, startDestination = ScreenNames.LoginScreen.name){

        composable(route = ScreenNames.LoginScreen.name){
               LoginScreen(authNavController = authNavigationController)
        }

        composable(route = ScreenNames.AccountSelectionScreen.name){
           AccountTypeSelectionScreen(authNavController = authNavigationController)
        }
        
        composable(route= ScreenNames.RegisterScreen.name){
            RegisterScreen(authNavController = authNavigationController)
        }

        composable(route= ScreenNames.FarmerNavigationScreen.name){
            FarmerNavigationScreen(authNavController = authNavigationController)
        }
    }
}