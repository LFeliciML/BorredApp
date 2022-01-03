package com.example.borredapp.data

import com.example.borredapp.data.remoteDataModel.network.ActivitieResponse

interface Repository {

    //Functions for use of services
    suspend fun getRandomActivity(): ActivitieResponse?
    suspend fun getActivityByType(type :String ): ActivitieResponse?
    suspend fun getActivityByKey(key : String): ActivitieResponse?
    suspend fun getActivityByParticipants(participants : String): ActivitieResponse?
    suspend fun getActivityByPrice( price : String): ActivitieResponse?
    suspend fun getActivityByPriceRange(query : String): ActivitieResponse?
    suspend fun getActivityByAccessibility(accessibility : String): ActivitieResponse?
    suspend fun getActivityByAccessibilityRange(query  : String): ActivitieResponse?

    //Functions for local data usage
    fun getParticipantsSharedPreferences():Int

}