package com.example.borredapp.ui.components.ActivitiesActivity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.borredapp.data.remoteDataModel.network.ActivitieResponse
import com.example.borredapp.domain.ActivityInteractor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SuggestionViewModel() : ViewModel() {

    private val interactor = ActivityInteractor()

     val dataResponse = MutableLiveData<ActivitieResponse?>()

    fun req(type: String){
        println(type)
        viewModelScope.launch(Dispatchers.IO){
                dataResponse.postValue( interactor.getActivityByType(type.lowercase()))
        }

    }

}