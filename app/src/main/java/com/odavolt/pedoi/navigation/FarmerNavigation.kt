package com.odavolt.pedoi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.odavolt.pedoi.screens.FarmerHomeScreen
import com.odavolt.pedoi.utils.ScreenNames


@Composable
fun  FarmerNavigation() {
    val farmerNavController = rememberNavController()
    
    NavHost(navController = farmerNavController, startDestination = ScreenNames.FarmerHomeScreen.name){
        composable(route = ScreenNames.FarmerHomeScreen.name){
            FarmerHomeScreen(farmerNavController = farmerNavController)
        }


    }
}