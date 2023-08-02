package com.odavolt.pedoi.screens

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.odavolt.pedoi.components.AccountTypeCard
import com.odavolt.pedoi.components.TitleText
import com.odavolt.pedoi.ui.theme.white
import com.odavolt.pedoi.R
import com.odavolt.pedoi.utils.ScreenNames

@Composable
fun AccountTypeSelectionScreen (authNavController: NavController){
    Surface(modifier = Modifier.fillMaxSize(), color = white) {
        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacer(modifier = Modifier.height(20.dp))

           TitleText(
             value = "How do you want to register ?",
               style = TextStyle(
                   fontSize = 25.sp
               )
           )

            Spacer(modifier = Modifier.height(30.dp))
            
            AccountTypeCard(
                title = "Member",
                description ="Amember account enables you\n" +
                    "to invest in exclusive agricultural\n" +
                    "deals  hand picked by PEDOI " ,
                image = painterResource(id =R.drawable.investor_account_img  ),
                onClick = {
                    authNavController.navigate(ScreenNames.RegisterScreen.name)
                    Log.d("Card", "AccountTypeSelectionScreen: Cliked---> ")
                }
            )
            
            AccountTypeCard(
                title = "Farmer", 
                description = "A farmer account enables you\n" +
                    "to access all the great services\n" +
                    "that empower your farming ",
                image = painterResource(id = R.drawable.farmer_account_img),
                onClick = {
                    authNavController.navigate(ScreenNames.RegisterScreen.name)
                    Log.d("Card", "AccountTypeSelectionScreen: B.Cliked---> ")
                }
            )

        }
    }
}