package com.example.borredapp.domain

import com.example.borredapp.data.Repository
import com.example.borredapp.data.remoteDataModel.network.ActivitieResponse
import com.example.borredapp.data.RepositoryImp
import com.example.borredapp.utils.ConverterUrl


class ActivityInteractor() {
    private val converterUrl = ConverterUrl()
    private val repository = RepositoryImp()
    //This variable contains the number of participants, retrieves them from shared preferences
    private val participants:Int = repository.getParticipantsSharedPreferences()


    suspend fun getActivityRandom(): ActivitieResponse?{
        return repository.getRandomActivity()
    }

    suspend fun getActivityByType(type : String): ActivitieResponse?{
        return repository.getActivityByType(converterUrl.getUrlByTypes(participants,type))
    }

    suspend fun getActivityByKey(key : String): ActivitieResponse?{
        return repository.getActivityByKey(converterUrl.getUrlByKey(participants,key))
    }

    suspend fun getActivityByParticipants(participants : Int ): ActivitieResponse?{
        return repository.getActivityByParticipants(participants.toString())
    }

    suspend fun getActivityByPrice(price:Float): ActivitieResponse?{
        return repository.getActivityByPrice(converterUrl.getUrlByPrice(participants,price))
    }

    suspend fun getActivityByPriceRange( minPrice : Float , maxPrice : Float): ActivitieResponse?{
        return repository.getActivityByPriceRange(
                converterUrl.getUrlByPriceRange(participants,minPrice,maxPrice))
    }

    suspend fun getActivityByAccessibility(accessibility : Float): ActivitieResponse?{
        return repository.getActivityByAccessibility(
                converterUrl.getActivityByAccessibility(participants, accessibility))
    }

    suspend fun getActivityByAccessibilityRange(
        minAccessibility : Float,
        maxAccessibility : Float): ActivitieResponse?{
        return repository.getActivityByAccessibilityRange(
            converterUrl.getActivityByAccessibilityRange(participants, minAccessibility, maxAccessibility))
    }




}