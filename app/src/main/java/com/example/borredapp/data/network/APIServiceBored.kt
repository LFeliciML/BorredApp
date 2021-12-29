package com.example.borredapp.data.network

import com.example.borredapp.data.ActivitieResponse
import retrofit2.http.GET

interface APIServiceBored {

    @GET("activity")
    suspend fun getRandomActivity(): ActivitieResponse
}