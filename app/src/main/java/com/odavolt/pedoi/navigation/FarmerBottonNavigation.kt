package com.odavolt.pedoi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.odavolt.pedoi.screens.FarmerAddRecordTabScreen
import com.odavolt.pedoi.screens.FarmerHomeTabScreen
import com.odavolt.pedoi.screens.FarmerProfileTabScreen
import com.odavolt.pedoi.utils.ScreenNames


@Composable
fun FarmerBottomNavigation(farmerBottomNavController: NavController){



    NavHost(navController = farmerBottomNavController as NavHostController, startDestination = ScreenNames.FarmerHomeTabScreen.name  ){
        composable(ScreenNames.FarmerHomeTabScreen.name){
            FarmerHomeTabScreen()
        }

        composable(ScreenNames.FarmerAddRecordTabScreen.name){
            FarmerAddRecordTabScreen()
        }

        composable(ScreenNames.FarmerProfileTabScreen.name){
            FarmerProfileTabScreen()
        }
    }
}





