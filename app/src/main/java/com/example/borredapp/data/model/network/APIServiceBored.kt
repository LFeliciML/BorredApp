package com.example.borredapp.data.model.network

import com.example.borredapp.data.model.ActivityResp
import retrofit2.http.GET
import retrofit2.http.Path

interface APIServiceBored {

    @GET("activity")
    suspend fun getRandomActivity(): ActivityResp

    @GET("activity")
    suspend fun getActivityByType(@Path("type") type:String)

    @GET("activity")
    suspend fun getActivityByKey(@Path("key") key:Int)

    @GET("activity")
    suspend fun getActivityByPlayers(@Path("participants") players:Int)

}