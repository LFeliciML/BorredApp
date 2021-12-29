package com.example.borredapp.data.model

import com.google.gson.annotations.SerializedName

data class ActivityResp(
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
