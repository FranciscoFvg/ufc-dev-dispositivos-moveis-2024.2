package com.example.postaiapp.data.model

data class User(
    val id : Int,
    val name: String,
    val email: String
)


data class UserCreateRequest(
    val name: String,
    val email: String
)