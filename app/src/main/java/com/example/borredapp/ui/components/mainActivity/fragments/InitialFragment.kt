package com.example.borredapp.ui.components.mainActivity.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.*
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.Navigation
import com.example.borredapp.R
import com.example.borredapp.databinding.InitialFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.ActivitiesActivity
import com.example.borredapp.ui.components.mainActivity.viewmodel.InitialFragmentViewModel
import com.example.borredapp.utils.BorredApp.Companion.prefs

class InitialFragment : Fragment() {

    private val viewModel: InitialFragmentViewModel by viewModels()
    private lateinit var binding: InitialFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InitialFragmentBinding.inflate(layoutInflater)


        //Observe viewModel
        viewModel.runApp.observe(this.viewLifecycleOwner,{
            if (it==true){
                val intent = Intent(this.context, ActivitiesActivity::class.java)
                startActivity(intent)
            }
        })

        //Event button start
        binding.buttonStart.setOnClickListener{

            val insertValueUser = binding.etNumberPersons.text.toString()

            if (conditionsAprobed() && insertValueUser.isNullOrBlank()){
                viewModel.startApp(0)
            } else if (conditionsAprobed() && checkIsNumber(insertValueUser)){
                viewModel.startApp(insertValueUser.toInt())
            }
        }

        //Start fragment terms and conditions.
        binding.linkConditions.setOnClickListener {
            this.view?.let { it1 -> Navigation.findNavController(it1)
                .navigate(R.id.action_initialFragment_to_conditionsFragment) }
        }

        return binding.root
    }



    //This function tries to convert String to int,
    // if the conversion fails, it throws an exception.
    private fun checkIsNumber(number: String): Boolean {
        try {
            val participants = number.toInt() //If it cannot be converted, the exception is thrown at this point.
            if (participants >= 0) {
                return true
            }
            Toast.makeText(
                this.context, "No se permiten numeros negativos.", Toast.LENGTH_SHORT).show()
            return false
        } catch (e: NumberFormatException) {
            Toast.makeText(this.context, "Solo se permite ingresar numeros enteros.", Toast.LENGTH_SHORT).show()
            return false
        }
    }


    //This function checks that the terms and conditions have been approved
    private fun conditionsAprobed(): Boolean {
        return binding.checkBoxConditions.isChecked
    }


}