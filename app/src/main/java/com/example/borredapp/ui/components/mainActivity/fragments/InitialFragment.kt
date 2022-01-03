package com.example.borredapp.ui.components.mainActivity.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.borredapp.databinding.InitialFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.ActivitiesActivity
import com.example.borredapp.ui.components.mainActivity.viewmodel.InitialFragmentViewModel
import com.example.borredapp.utils.BorredApp
import com.example.borredapp.utils.BorredApp.Companion.prefs

class InitialFragment : Fragment() {

    private val viewModel : InitialFragmentViewModel by viewModels()
    private lateinit var binding: InitialFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InitialFragmentBinding.inflate(layoutInflater)

        binding.buttonStart.setOnClickListener{

            val insertUser = binding.etNumberPersons.text.toString()

            if (insertUser.isNullOrBlank()){
                    setSharedPreferences(0)
                    runActivity()
            } else {
                if(checkIsNumber(insertUser)){
                    runActivity()
                } else{
                    Toast.makeText(this.context,
                    "Los numeros deben ser mayores o iguales a 0.",
                    Toast.LENGTH_SHORT).show()
                }
            }
        }
        return binding.root
    }


    //This function get sharedPreferences.
    fun setSharedPreferences(participants:Int){
        val editor = prefs.edit()
        editor.putInt("PARTICIPANTS",participants)
        editor.commit()
    }

    //This execute activities activity.
    fun runActivity(){
        val intent = Intent(this.context, ActivitiesActivity::class.java)
        startActivity(intent)
    }

    //This function tries to convert String to int,
    // if the conversion fails, it throws an exception.
    fun checkIsNumber(number : String) : Boolean{
        try {
            var participants = number.toInt()
            if (participants>=0){
                setSharedPreferences(participants)
               return true
            }
            return false
        }catch (e:NumberFormatException){
            Toast.makeText(this.context,
            "Solo se permite ingresar numeros enteros.",
            Toast.LENGTH_SHORT).show()
            return false
        }
    }



}