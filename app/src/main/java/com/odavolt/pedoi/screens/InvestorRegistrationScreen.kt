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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.odavolt.pedoi.components.CustomButton
import com.odavolt.pedoi.components.CustomTextField
import com.odavolt.pedoi.components.NormalText
import com.odavolt.pedoi.components.TitleText
import com.odavolt.pedoi.ui.theme.gray700
import com.odavolt.pedoi.ui.theme.green700
import com.odavolt.pedoi.utils.ScreenNames

@Composable
fun InvestorRegistrationScreen(authNavController: NavController){
    val firstName = remember {
        mutableStateOf(TextFieldValue(""))
    }

    val lastName = remember {
        mutableStateOf(TextFieldValue(""))
    }

    val email = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val password = remember {
        mutableStateOf(TextFieldValue(""))
    }


    fun registerMember(){
        var member = Member(last_name = lastName.value.text, first_name = firstName.value.text, email = email.value.text )

        Log.d("REG", "registerMember: ${member.email}")
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
            TitleText(value = "Register")
            NormalText(value = "Pedoi Member registration")

            Spacer(modifier = Modifier.height(40.dp))
            CustomTextField(
                value = firstName,
                placeholder = "Enter first name" ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                imeAction = ImeAction.Next,
                onValueChange = {
                    firstName.value = it
                },

                )

            Spacer(modifier = Modifier.height(15.dp))
            CustomTextField(
                value = lastName,
                placeholder = "Enter last name" ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),
                imeAction = ImeAction.Next,
                onValueChange = {
                    lastName.value= it
                },

                )

            Spacer(modifier = Modifier.height(15.dp))
            CustomTextField(
                value = email,
                placeholder = "Enter email" ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                imeAction = ImeAction.Next,
                onValueChange = {
                    email.value = it
                },

                )

            Spacer(modifier = Modifier.height(15.dp))

            CustomTextField(
                value = password,
                placeholder = "Enter password" ,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                imeAction = ImeAction.Done,
                onValueChange = {
                    password.value = it
                },

                )

            Spacer(modifier = Modifier.height(30.dp))

            CustomButton(title = "Register") {
                registerMember()
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp, horizontal = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Have an account already ?", color = gray700, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                Text(text = "Login", color = green700, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, modifier = Modifier.clickable {
                    authNavController.navigate(ScreenNames.LoginScreen.name)
                })
            }

        }

    }
}