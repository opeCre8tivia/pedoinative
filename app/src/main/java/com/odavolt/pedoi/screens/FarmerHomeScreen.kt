package com.odavolt.pedoi.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.odavolt.pedoi.navigation.FarmerBottomNavigation
import com.odavolt.pedoi.ui.theme.gray700
import com.odavolt.pedoi.ui.theme.green700
import com.odavolt.pedoi.ui.theme.white
import com.odavolt.pedoi.utils.ScreenNames


@Composable
fun  FarmerHomeScreen(farmerNavController: NavController) {

    val farmerBottomNavController = rememberNavController()
    
    Scaffold(
        topBar = {
             TopAppBar(backgroundColor = white, elevation = 0.dp,) {
                 Row(modifier = Modifier
                     .fillMaxWidth(),
                     horizontalArrangement = Arrangement.Center,
                     verticalAlignment = Alignment.CenterVertically

                 ) {
                     Text(text = "Welcome")
                 }
             }
        },
        bottomBar = {
           MainBottomNavigation(farmerBottomNavController = farmerBottomNavController)
        },
        content = { padding ->
            Column(modifier = Modifier
                .padding(padding)
                .fillMaxSize()) {
                FarmerBottomNavigation(farmerBottomNavController = farmerBottomNavController) }
            }


    )
}




@Composable
fun MainBottomNavigation (farmerBottomNavController: NavHostController){

    val backStack = farmerBottomNavController.currentBackStackEntryAsState()
    val selectedIndex = remember { mutableStateOf(0) }

    val currentRoute =  backStack.value?.destination?.route

    BottomNavigation(backgroundColor = Color.White, elevation = 1.dp, contentColor = green700) {
        BottomNavigationItem(
            selected = currentRoute === ScreenNames.FarmerHomeTabScreen.name ,
            onClick = {
                farmerBottomNavController.navigate(ScreenNames.FarmerHomeTabScreen.name)
            },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription ="home icon" )
            },

            )


        BottomNavigationItem(
            selected = currentRoute === ScreenNames.FarmerAddRecordTabScreen.name ,
            onClick = {
                farmerBottomNavController.navigate(ScreenNames.FarmerAddRecordTabScreen.name)
            },
            icon = {
                Card(modifier = Modifier
                    .width(40.dp)
                    .height(40.dp),
                    backgroundColor = green700,
                    shape = CircleShape,

                ) {

                    Box(modifier = Modifier
                        .width(40.dp)
                        .height(40.dp),
                        contentAlignment = Alignment.Center,

                        ) {
                        Icon(imageVector = Icons.Default.Add, contentDescription ="home icon" )
                    }
                }
            })


        BottomNavigationItem(
            selected = currentRoute === ScreenNames.FarmerProfileTabScreen.name ,
            onClick = {
                farmerBottomNavController.navigate(ScreenNames.FarmerProfileTabScreen.name)
            },
            icon = {
                Icon(imageVector = Icons.Default.Person, contentDescription ="home icon" )
            })


    }
}







