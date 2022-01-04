package com.example.borredapp.ui.components.ActivitiesActivity.viewmodel

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

     val dataResponse = MutableLiveData<ActivitieResponse>()


    fun req(type: String){
        viewModelScope.launch(Dispatchers.IO){

            withContext(Dispatchers.Main){

               dataResponse.postValue( interactor.getActivityByType(type) )


            }
        }

    }

}