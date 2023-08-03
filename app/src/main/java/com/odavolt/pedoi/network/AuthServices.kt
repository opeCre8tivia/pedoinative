package com.odavolt.pedoi.network

import com.odavolt.pedoi.LoginResponse

object AuthServices {

   val loginUserService:apiService  by lazy {
       RetrofitInstance.retrofit.create(apiService::class.java)
   }
}