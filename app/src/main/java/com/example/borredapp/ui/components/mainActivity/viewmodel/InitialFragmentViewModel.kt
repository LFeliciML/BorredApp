package com.example.borredapp.ui.components.mainActivity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.borredapp.utils.BorredApp

class InitialFragmentViewModel() : ViewModel() {



    val runApp = MutableLiveData<Boolean>()

    fun startApp(participants: Int){
        runApp.postValue(setSharedPreferences(participants))
    }

    //This function get sharedPreferences.
     private fun setSharedPreferences(participants: Int):Boolean{
        val editor = BorredApp.prefs.edit()
        editor.putInt("PARTICIPANTS", participants)
        return editor.commit()
    }
}