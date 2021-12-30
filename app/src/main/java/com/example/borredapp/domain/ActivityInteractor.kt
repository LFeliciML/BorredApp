package com.example.borredapp.domain

import com.example.borredapp.data.ActivitieResponse
import com.example.borredapp.data.RepositoryImp


class ActivityInteractor(
    private val repositoryImp: RepositoryImp
) {

    suspend fun getActivityRandom():ActivitieResponse?{
        return repositoryImp.getRandomActivity()
    }

    suspend fun getActivityByType(type : String ):ActivitieResponse?{
        return repositoryImp.getActivityByType(type)
    }

    suspend fun getActivityByKey(key : String):ActivitieResponse?{
        return repositoryImp.getActivityByKey(key)
    }

    suspend fun getActivityByParticipants(participants : Int ):ActivitieResponse?{
        return repositoryImp.getActivityByParticipants(participants.toString())
    }

    suspend fun getActivityByPrice(price:String):ActivitieResponse?{
        return repositoryImp.getActivityByPrice(price)
    }

    suspend fun getActivityByPriceRange( minPrice : String , maxPrice : String):ActivitieResponse?{
        return repositoryImp.getActivityByPriceRange(minPrice,maxPrice)
    }

    suspend fun getActivityByAccessibility(accessibility : String):ActivitieResponse?{
        return repositoryImp.getActivityByAccessibility(accessibility)
    }

    suspend fun getActivityByAccessibilityRange(minAccessibility : String, maxAccessibility : String):ActivitieResponse?{
        return repositoryImp.getActivityByAccessibilityRange(minAccessibility,maxAccessibility)
    }




}