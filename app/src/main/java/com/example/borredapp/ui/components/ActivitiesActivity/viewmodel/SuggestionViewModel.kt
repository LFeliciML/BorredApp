package com.example.borredapp.ui.components.ActivitiesActivity.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.borredapp.data.remoteDataModel.network.ActivitieResponse
import com.example.borredapp.domain.ActivityInteractor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SuggestionViewModel() : ViewModel() {

    private val interactor = ActivityInteractor()

     val dataResponse = MutableLiveData<ActivitieResponse?>()

    fun reqByType(type: String){
        println(type)
        viewModelScope.launch(Dispatchers.IO){

//            val apiResp = interactor?.getActivityByType(type)
//            Log.e("data: ", apiResp.toString())
//            withContext(Dispatchers.Main){
//                if(apiResp!=null){
//                    //_data.value = apiResp!!
//                }
//            }
                dataResponse.postValue( interactor.getActivityByType(type.lowercase()))
        }
    }

    fun reqRandom(){
        viewModelScope.launch(Dispatchers.IO) {
            dataResponse.postValue(interactor.getActivityRandom())
        }
    }

}