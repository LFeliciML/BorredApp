package com.example.borredapp.data.remoteDataModel.network

data class ActivitieResponse(
    val activity: String,
    val accessibility : Float,
    val type : String,
    val participants : Int,
    val price : Float,
    val link : String?=null,
    val key : String?=null
)
