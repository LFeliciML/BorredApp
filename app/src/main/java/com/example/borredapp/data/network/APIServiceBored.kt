package com.example.borredapp.data.network

import com.example.borredapp.data.ActivitieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIServiceBored {

    @GET()
    suspend fun getRandomActivity(@Url path: String): Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByKey(@Url key : String) : Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByType(@Url type : String) : Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByParticipants(@Url participants :String) : Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByPrice(@Url price :String) : Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByPriceRange(@Url priceRange :String) : Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByAccessibility(@Url accessibility :String) : Response<ActivitieResponse?>

    @GET()
    suspend fun getActivityByAccessibilityRange(@Url accessibilityRange :String) : Response<ActivitieResponse?>


}