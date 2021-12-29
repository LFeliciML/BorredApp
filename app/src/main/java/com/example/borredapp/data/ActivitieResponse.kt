package com.example.borredapp.data

import com.google.gson.annotations.SerializedName

data class ActivitieResponse(
    val activity: String,
    @SerializedName("accessibility")
    val access:Float,
    val type: String,
    @SerializedName("participants")
    val players: Int,
    val price: Float,
    val link: String,
    val key: String
)
