package com.odavolt.pedoi.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.odavolt.pedoi.ui.components.CustomTextInput
import com.odavolt.pedoi.ui.components.TextHeading
import com.odavolt.pedoi.ui.theme.gray500
import com.odavolt.pedoi.ui.theme.white

@Composable
fun LoginScreen(){

   var email = remember {
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
              keyboardActions = KeyboardActions.Default,
              keyboardOptions = KeyboardOptions.Default,
              value = email.value
          ){ newEmail ->
             email.value = newEmail
          }


          
      }

    }
}


@Composable
@Preview(showBackground = true)

fun DefaultPrev(){
    LoginScreen()
}