package com.example.borredapp.data

import com.example.borredapp.data.network.APIServiceBored
import com.example.borredapp.utils.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RepositoryImp : Repository {

    override suspend fun getRandomActivity(): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java)
        .getRandomActivity(ACTIVITY_RANDOM)
        val response = call.body()

        if (call.isSuccessful){
            return response
        }else {
            return null
        }
    }

    override suspend fun getActivityByKey(key:String): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByKey(SEARCH_BY_KEY+key)

        val response = call.body()

        if (call.isSuccessful){
            return response
        } else {
            return null
        }
    }

    override suspend fun getActivityByType(type :String): ActivitieResponse? {
       val call = getRetrofit().create(APIServiceBored::class.java).
       getActivityByType(SEARCH_BY_TYPE + type)

        val response = call.body()

        if(call.isSuccessful){
            return response
        }else {
            return null
        }
    }

    override suspend fun getActivityByParticipants(participants: String): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByParticipants(SEARCH_BY_PARTICIPANTS + participants)

        val response = call.body()

        if(call.isSuccessful){
            return response
        }else{
            return null
        }
    }

    override suspend fun getActivityByPrice(price: String): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByPrice(SEARCH_BY_PRICE + price)

        val response = call.body()

        if(call.isSuccessful){
            return response
        }else{
            return null
        }
    }

    override suspend fun getActivityByPriceRange(
        minPrice: String,
        maxPrice: String
    ): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByPriceRange(SEARCH_BY_PRICE_RANGE+minPrice+
                                          BETWEEN_PRICE_RANGE+maxPrice)

        val response = call.body()

        if (call.isSuccessful){
            return response
        }else{
            return null
        }
    }

    override suspend fun getActivityByAccessibility(accessibility: String): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByAccessibility(SEARCH_BY_ACCESSIBILITY + accessibility)

        val response = call.body()

        if (call.isSuccessful){
            return response
        } else{
            return null
        }
    }

    override suspend fun getActivityByAccessibilityRange(
        minAccessibility: String,
        maxAccessibility: String
    ): ActivitieResponse? {
        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByAccessibilityRange(SEARCH_BY_ACCESSIBILITY_RANGE + minAccessibility +
                                                        BETWEEN_ACCESSIBILITY_RANGE + maxAccessibility)

        val response = call.body()

        if (call.isSuccessful){
            return response
        }else{
            return null
        }
    }


    private fun getRetrofit(): Retrofit {
    return Retrofit.Builder().baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create()).build()
    }

}