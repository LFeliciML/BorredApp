package com.example.borredapp.data

interface Repository {
    suspend fun getRandomActivity():ActivitieResponse
    suspend fun getActivityByType():ActivitieResponse
    suspend fun getActivityByKey():ActivitieResponse
    suspend fun getActivityByPlayers():ActivitieResponse
}