package com.odavolt.pedoi.network

import com.odavolt.pedoi.LoginResponse

class ApiActions {

    suspend fun loginUser(): LoginResponse {
        return AuthServices.loginUserService.loginUser()
    }

}