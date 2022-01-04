package com.example.borredapp.ui.components.ActivitiesActivity.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.borredapp.data.Repository
import com.example.borredapp.data.remoteDataModel.network.ActivitieResponse
import com.example.borredapp.domain.ActivityInteractor
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SuggestionViewModel(private val activityInteractor: ActivityInteractor?) : ViewModel() {

    constructor() : this(null)

    private val _data = MutableLiveData<ActivitieResponse>()
    val data: LiveData<ActivitieResponse> get() = _data

    fun req(type: String){
        viewModelScope.launch(Dispatchers.IO){
            val apiResp = activityInteractor?.getActivityByType(type)
            Log.e("data: ", apiResp.toString())
            withContext(Dispatchers.Main){
                if(apiResp!=null){
                    _data.value = apiResp!!
                }
            }
        }

    }

}