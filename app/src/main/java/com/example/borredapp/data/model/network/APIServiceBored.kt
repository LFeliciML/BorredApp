package com.example.borredapp.data.model.network

import com.example.borredapp.data.model.ActivityResp

interface APIServiceBored {

   // @GET("activity")
    suspend fun getRandomActivity(): ActivityResp
}