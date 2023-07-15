package com.odavolt.pedoi.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.odavolt.pedoi.Components.TitleText


@Composable
fun AuthNavigationScreen(navController: NavController){
    Surface(modifier = Modifier
        .fillMaxSize(),
        color = Color(0xFFFFFFFF)

    ) {

        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

        Spacer(modifier = Modifier.height(20.dp))
            TitleText(value = "Login")

        }

    }
}