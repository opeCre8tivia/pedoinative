package com.odavolt.pedoi.screens

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.odavolt.pedoi.components.CustomButton
import com.odavolt.pedoi.components.CustomTextField
import com.odavolt.pedoi.components.NormalText
import com.odavolt.pedoi.components.TitleText
import com.odavolt.pedoi.screens.auth.AuthViewModel
import com.odavolt.pedoi.ui.theme.gray700
import com.odavolt.pedoi.ui.theme.green700
import com.odavolt.pedoi.utils.ScreenNames
import dagger.hilt.android.lifecycle.HiltViewModel


@Composable
fun LoginScreen(
    authNavController: NavController,
    viewModel:AuthViewModel = hiltViewModel()
){

    var email  = viewModel.email
    var password = remember {
        mutableStateOf(TextFieldValue(""))
    }
    var isValid  = remember{
        mutableStateOf(false)
    }

    if(email.value.text.trim().isNotEmpty() && password.value.text.trim().isNotEmpty()){
        isValid.value = true
    }


    Surface(modifier = Modifier
        .fillMaxSize(),
        color = Color(0xFFFFFFFF)

    ) {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            Spacer(modifier = Modifier.height(20.dp))
            TitleText(value = "Login")
            NormalText(value = "Enter your details to login")

            Spacer(modifier = Modifier.height(40.dp))
            CustomTextField(
                value = email,
                placeholder = "Enter email",
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                imeAction = ImeAction.Next,
                onValueChange = {
                    Log.d("Password", "LoginScreen: $it")
                    email.value = it
            },

            )

            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value =password,
                placeholder = "Enter password",
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                imeAction = ImeAction.Done,
                onValueChange = {
                    Log.d("Password", "LoginScreen: $it")
                    password.value = it
                },

                )

            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(title = "Login", enabled = isValid.value) {
                Log.d("BTN", "LoginScreen: Clicked---->")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp, horizontal = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = CenterVertically
            ) {
                Text(text = "Don't have an account yet ?", color = gray700, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                Text(text = "Register", color = green700, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, modifier = Modifier.clickable {
                    authNavController.navigate(ScreenNames.AccountSelectionScreen.name)
                })
            }

        }

    }
}

