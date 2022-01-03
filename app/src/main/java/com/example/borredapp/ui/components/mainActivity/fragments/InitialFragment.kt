package com.example.borredapp.ui.components.mainActivity.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.*
import com.example.borredapp.R
import com.example.borredapp.databinding.InitialFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.ActivitiesActivity
import com.example.borredapp.ui.components.mainActivity.viewmodel.InitialFragmentViewModel
import com.example.borredapp.utils.BorredApp.Companion.prefs

class InitialFragment : Fragment() {

    private val viewModel : InitialFragmentViewModel by viewModels()
    private lateinit var binding: InitialFragmentBinding


    @SuppressLint("ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InitialFragmentBinding.inflate(layoutInflater)
        binding.buttonStart.setOnClickListener{

            if(conditionsAprobed()){
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
            } else {
                Toast.makeText(this.context,"Aceptar términos y condiciones",
                Toast.LENGTH_SHORT).show()
            }
        }

       binding.linkConditions.setOnClickListener {
          parentFragmentManager.beginTransaction()
              .add(R.id.fragmentContainerView,ConditionsFragment()).addToBackStack(null).commit()
       }

        return binding.root
    }


    //This function get sharedPreferences.
    private fun setSharedPreferences(participants:Int){
        val editor = prefs.edit()
        editor.putInt("PARTICIPANTS",participants)
        editor.commit()
    }

    //This execute activities activity.
    private fun runActivity(){
        val intent = Intent(this.context, ActivitiesActivity::class.java)
        startActivity(intent)
    }

    //This function tries to convert String to int,
    // if the conversion fails, it throws an exception.
    private fun checkIsNumber(number : String) : Boolean{
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


    private fun conditionsAprobed():Boolean{
       return binding.checkBoxConditions.isChecked
    }




}