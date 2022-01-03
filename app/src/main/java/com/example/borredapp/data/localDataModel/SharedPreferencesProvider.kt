package com.example.borredapp.data.localDataModel

import com.example.borredapp.utils.BorredApp

class SharedPreferencesProvider {

    //Get the number of participants from the shared preferences.
   fun getParticipants():Int{
      return BorredApp.prefs.getInt("PARTICIPANTS",0)
   }

}