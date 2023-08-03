package com.odavolt.pedoi.network

import com.odavolt.pedoi.LoginResponse
import retrofit2.http.GET

interface apiService {

    @GET("login")
    suspend fun loginUser():LoginResponse

}