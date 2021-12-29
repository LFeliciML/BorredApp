package com.example.borredapp.data.model.network

import com.example.borredapp.data.model.ActivityResp
import retrofit2.http.GET

interface APIServiceBored {

    @GET("activity")
    suspend fun getRandomActivity(): ActivityResp
}