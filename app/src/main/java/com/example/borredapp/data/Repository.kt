package com.example.borredapp.data

interface Repository {
    suspend fun getRandomActivity():ActivitieResponse?
    suspend fun getActivityByType(type :String ):ActivitieResponse?
    suspend fun getActivityByKey(key : String):ActivitieResponse?
    suspend fun getActivityByParticipants(participants : String):ActivitieResponse?
    suspend fun getActivityByPrice( price : String):ActivitieResponse?
    suspend fun getActivityByPriceRange( minPrice : String , maxPrice : String):ActivitieResponse?
    suspend fun getActivityByAccessibility(accessibility : String):ActivitieResponse?
    suspend fun getActivityByAccessibilityRange(minAccessibility : String, maxAccessibility : String):ActivitieResponse?
}