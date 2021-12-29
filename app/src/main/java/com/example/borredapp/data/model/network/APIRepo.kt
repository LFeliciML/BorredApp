package com.example.borredapp.data.model.network

import com.example.borredapp.data.model.ActivityResp

interface APIRepo {

    suspend fun getRandomActivity():ActivityResp
    suspend fun getActivityByType():ActivityResp
}