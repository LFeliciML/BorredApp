package com.example.borredapp.ui.components.mainActivity.viewmodel

import androidx.lifecycle.ViewModel
import com.example.borredapp.domain.ActivityInteractor

class InitialFragmentViewModel(private val interactor: ActivityInteractor) : ViewModel() {

    //fun
    //Para mi este viewmodel y el de conditions estan de mas

    suspend fun pruebaApi(){
        //println(interactor.getActivityRandom())
    }


}