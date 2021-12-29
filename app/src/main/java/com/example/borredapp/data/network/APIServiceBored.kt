package com.example.borredapp.data.network

import com.example.borredapp.data.ActivitieResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface APIServiceBored {
//asd
    @GET("activity")
    suspend fun getRandomActivity(): ActivitieResponse

    @GET("activity")
    suspend fun getActivityByType(@Path("type") type:String)

    @GET("activity")
    suspend fun getActivityByKey(@Path("key") key:Int)

    @GET("activity")
    suspend fun getActivityByPlayers(@Path("participants") players:Int)
}