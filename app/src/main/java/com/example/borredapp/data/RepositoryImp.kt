package com.example.borredapp.data

import com.example.borredapp.data.localDataModel.SharedPreferencesProvider
import com.example.borredapp.data.remoteDataModel.network.APIServiceBored
import com.example.borredapp.data.remoteDataModel.network.ActivitieResponse
import com.example.borredapp.utils.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepositoryImp() : Repository {
    private val localDataProviders = SharedPreferencesProvider()

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

        val call = getRetrofit().create(APIServiceBored::class.java).getActivityByKey(key)

        val response = call.body()

        if (call.isSuccessful){
            return response
        } else {
            return null
        }
    }


    override suspend fun getActivityByType(type :String): ActivitieResponse? {

       val call = getRetrofit().create(APIServiceBored::class.java).getActivityByType(type)

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

        val call = getRetrofit().create(APIServiceBored::class.java).getActivityByPrice(price)

        val response = call.body()

        if(call.isSuccessful){
            return response
        }else{
            return null
        }
    }


    override suspend fun getActivityByPriceRange(query:String): ActivitieResponse? {

        val call = getRetrofit().create(APIServiceBored::class.java).getActivityByPriceRange(query)

        val response = call.body()

        if (call.isSuccessful){
            return response
        }else{
            return null
        }
    }


    override suspend fun getActivityByAccessibility(accessibility: String): ActivitieResponse? {

        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByAccessibility(accessibility)

        val response = call.body()

        if (call.isSuccessful){
            return response
        } else{
            return null
        }
    }


    override suspend fun getActivityByAccessibilityRange(query: String): ActivitieResponse? {

        val call = getRetrofit().create(APIServiceBored::class.java).
        getActivityByAccessibilityRange(query)

        val response = call.body()

        if (call.isSuccessful){
            return response
        }else{
            return null
        }
    }


    //This function obtains the number of participants
    override fun getParticipantsSharedPreferences(): Int {
        return localDataProviders.getParticipants()
    }


    //Instance retrofit.
    //This function will be used by the suspended functions of this class.
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

}