package com.odavolt.pedoi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.odavolt.pedoi.navigation.MainNavigation
import com.odavolt.pedoi.screens.auth.AuthViewModel


import com.odavolt.pedoi.ui.theme.PedoiTheme
import com.odavolt.pedoi.ui.theme.gray500
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PedoiTheme {
               App {
                 MainNavigation()

               }
            }
        }
    }
}


@Composable
fun App(modifier:Modifier = Modifier.fillMaxSize(),content:@Composable ()-> Unit){
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier
            .fillMaxSize()
        ,
        color = gray500
    ){
      Column(
          modifier = Modifier
          .fillMaxSize(),
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Top

      ) {
          content()
      }
    }
}


