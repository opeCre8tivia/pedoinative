package com.odavolt.pedoi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.odavolt.pedoi.R
import com.odavolt.pedoi.utils.ScreenNames
import kotlinx.coroutines.delay

@Composable
fun  PedoiSplashScreen(navController: NavController){

    LaunchedEffect(key1 = true ){
        delay(4000L)
        navController.navigate(ScreenNames.AuthNavigationScreen.name)
    }
    Surface(modifier = Modifier
        .fillMaxSize(),
        color = Color(0xFFFFFFFF)
    
    ) {
        
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            
        ) {
            
           Image(
               painter = painterResource(id = R.drawable.pedoi_logo),
               contentDescription ="pedoi logo",
               modifier = Modifier
                   .width(80.dp)
                   .height(80.dp)

           )
            
        }
        
    }
}