package com.odavolt.pedoi.screens.auth

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.odavolt.pedoi.LoginResponse
import com.odavolt.pedoi.network.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject


@HiltViewModel
class AuthViewModel  @Inject constructor( val repository: AppRepository):ViewModel() {
    //login functionality

    var email = mutableStateOf(TextFieldValue(""))
    var password = mutableStateOf(TextFieldValue(""))
    var isValid = mutableStateOf(false)


   fun loginUser (){

       viewModelScope.launch {
           try {

               val result:LoginResponse = repository.loginUser()
               Log.d("LOGIN", "loginUser: $result")

           }catch (e:Exception){
               Log.d("LOGIN", "loginUser: $e")
           }

       }


    }

    //register functionality



}