package com.odavolt.pedoi.screens.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class AuthViewModel  @Inject constructor():ViewModel() {
    //login functionality

    var email = mutableStateOf(TextFieldValue(""))
    var password = mutableStateOf(TextFieldValue(""))
    var isValid = mutableStateOf(false)


    //register functionality



}