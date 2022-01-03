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

    private val viewModel: InitialFragmentViewModel by viewModels()
    private lateinit var binding: InitialFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InitialFragmentBinding.inflate(layoutInflater)

        //Event button Start
        binding.buttonStart.setOnClickListener {

            if (conditionsAprobed()) {
                val insertValueUser = binding.etNumberPersons.text.toString()

                if (insertValueUser.isNullOrBlank()) {
                    setSharedPreferences(0)
                    runActivity()
                } else {
                    if (checkIsNumber(insertValueUser)) {
                        runActivity()
                    } else {
                        Toast.makeText(
                            this.context,
                            "Los numeros deben ser mayores o iguales a 0.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            } else {
                Toast.makeText(
                    this.context, "Aceptar términos y condiciones",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        binding.linkConditions.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, ConditionsFragment()).addToBackStack(null).commit()
        }

        return binding.root
    }


    //This function get sharedPreferences.
    private fun setSharedPreferences(participants: Int) {
        val editor = prefs.edit()
        editor.putInt("PARTICIPANTS", participants)
        editor.commit()
    }

    //This execute activities activity.
    private fun runActivity() {
        val intent = Intent(this.context, ActivitiesActivity::class.java)
        startActivity(intent)
    }

    //This function tries to convert String to int,
    // if the conversion fails, it throws an exception.
    private fun checkIsNumber(number: String): Boolean {
        try {
            val participants = number.toInt() //If it cannot be converted, the exception is thrown at this point.
            if (participants >= 0) {
                setSharedPreferences(participants) //set shared preferences.
                return true
            }
            return false
        } catch (e: NumberFormatException) {
            Toast.makeText(
                this.context,
                "Solo se permite ingresar numeros enteros.",
                Toast.LENGTH_SHORT
            ).show()
            return false
        }
    }


    //This function checks that the terms and conditions have been approved
    private fun conditionsAprobed(): Boolean {
        return binding.checkBoxConditions.isChecked
    }


}