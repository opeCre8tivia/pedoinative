package com.odavolt.pedoi.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.odavolt.pedoi.ui.theme.gray500


@Composable
fun FarmerProfileTabScreen() {
    Surface(modifier = Modifier
        .fillMaxSize(),
        color = gray500

    ) {


        Column (modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally


        ){

            Text(text = "Farmer Home")
        }

    }
}