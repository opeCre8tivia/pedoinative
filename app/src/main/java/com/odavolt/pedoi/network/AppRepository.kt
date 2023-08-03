package com.odavolt.pedoi.network

import com.odavolt.pedoi.LoginResponse
import javax.inject.Inject

class AppRepository @Inject constructor() {

    suspend fun loginUser(): LoginResponse {
        return AuthServices.loginUserService.loginUser()
    }

}