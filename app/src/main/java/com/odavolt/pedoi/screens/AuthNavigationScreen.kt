package com.odavolt.pedoi.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.odavolt.pedoi.navigation.AuthNavigation


@Composable
fun AuthNavigationScreen(navController: NavController){
    Surface(modifier = Modifier
        .fillMaxSize(),
        color = Color(0xFFFFFFFF)

    ) {

      AuthNavigation()

    }
}