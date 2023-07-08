package com.odavolt.pedoi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.odavolt.pedoi.ui.screens.auth.LoginScreen
import com.odavolt.pedoi.ui.screens.auth.RegisterScreen


@Composable
fun PedoiNavigation(){

    /**
     * instantiating the Controller class using rememberController
     * */

    val navController = rememberNavController()

    /**
     * instantiating the nav host
    **/

    NavHost(navController = navController, startDestination =ScreenNames.loginScreen.name  ){
        composable(route = ScreenNames.loginScreen.name){
            LoginScreen(navController = navController )
        }

        composable(route = ScreenNames.registerScreen.name){
            RegisterScreen(navController = navController)
        }
    }

}