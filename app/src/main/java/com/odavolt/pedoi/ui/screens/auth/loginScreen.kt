package com.odavolt.pedoi.ui.screens.auth

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.odavolt.pedoi.navigation.ScreenNames
import com.odavolt.pedoi.ui.components.CustomButton
import com.odavolt.pedoi.ui.components.CustomTextInput
import com.odavolt.pedoi.ui.components.PasswordTextInput
import com.odavolt.pedoi.ui.components.TextHeading
import com.odavolt.pedoi.ui.theme.black
import com.odavolt.pedoi.ui.theme.green700
import com.odavolt.pedoi.ui.theme.white

@Composable
fun LoginScreen(navController:NavController){

   var email = remember {
       mutableStateOf(TextFieldValue(""))
   }

    var password = remember {
        mutableStateOf(TextFieldValue(""))
    }

  Surface(
      modifier = Modifier
          .fillMaxSize(),
      color = white

  ) {

      Column(
          modifier = Modifier
              .fillMaxSize()
              .padding(20.dp)
          ,
          verticalArrangement = Arrangement.Top,
          horizontalAlignment = Alignment.CenterHorizontally

      ) {

          Spacer(modifier = Modifier
              .fillMaxWidth()
              .height(80.dp))
         TextHeading(value = "Login")
          Spacer(modifier = Modifier
              .fillMaxWidth()
              .height(60.dp))


          CustomTextInput(
              placeholder = "Enter email",
              keyboardActions = KeyboardActions(
                  onDone = null
              ),
              keyboardOptions = KeyboardOptions(
                  keyboardType = KeyboardType.Email
              ),
              icon = Icons.Default.Email,
              value = email.value
          ){ value ->
             email.value = value
          }

          Spacer(modifier = Modifier.height(20.dp))

          PasswordTextInput(
              placeholder = "Enter password",
              keyboardActions = KeyboardActions.Default,
              keyboardOptions = KeyboardOptions(
                  keyboardType = KeyboardType.Password
              ),
              icon = Icons.Default.Lock,
              value = password.value
          ){ value ->
              password.value = value
          }

          Spacer(modifier = Modifier.height(40.dp))
          
          CustomButton(title = "Login") {
                 //is click function
              Log.d("BTN", "LoginScreen: Clicked")
          }
          
         Row(
             modifier = Modifier
                 .fillMaxWidth().padding(horizontal = 10.dp),
             horizontalArrangement = Arrangement.SpaceBetween,
             verticalAlignment = Alignment.CenterVertically
         ) {
             
             Text(text = "Don't have an account yet?", fontSize = 14.sp, fontWeight = FontWeight.SemiBold,color = black)
             Text(
                 text = "Register",
                 modifier = Modifier.clickable {
                       navController.navigate(ScreenNames.registerScreen.name)
                 },
                 fontSize = 14.sp, fontWeight = FontWeight.SemiBold,color = green700)
         }
          


          
      }

    }
}


@Composable
@Preview(showBackground = true)

fun DefaultPrev(){
//    LoginScreen(navController = )
}