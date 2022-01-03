package com.example.borredapp.utils

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class BorredApp : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this
        prefs = getContext()!!.getSharedPreferences("prefs", MODE_PRIVATE)
    }

    companion object{
        lateinit var app: BorredApp
        lateinit var prefs : SharedPreferences
        fun getContext(): Context? {
            return app.applicationContext
        }
    }



}