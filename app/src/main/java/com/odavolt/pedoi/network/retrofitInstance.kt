package com.odavolt.pedoi.network

import com.odavolt.pedoi.constants.BaseUri
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val retrofit: Retrofit by lazy {
         Retrofit.Builder()
             .baseUrl(BaseUri.BASE_URI)
             .addConverterFactory(GsonConverterFactory.create())
             .build()
    }
}