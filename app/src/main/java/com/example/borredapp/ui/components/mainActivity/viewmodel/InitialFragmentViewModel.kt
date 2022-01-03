package com.example.borredapp.ui.components.mainActivity.viewmodel

import android.content.Intent
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.borredapp.domain.ActivityInteractor
import com.example.borredapp.ui.components.ActivitiesActivity.ActivitiesActivity
import com.example.borredapp.utils.BorredApp

class InitialFragmentViewModel() : ViewModel() {

    val result = MutableLiveData<Boolean>()

}