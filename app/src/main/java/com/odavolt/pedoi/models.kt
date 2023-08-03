package com.odavolt.pedoi

data class User(
    val id:Int,
    val name:String,
    val sex:Int
)


data class LoginResponse (
    val isError:Boolean,
    val msg:String,
    val payload:User
        )
