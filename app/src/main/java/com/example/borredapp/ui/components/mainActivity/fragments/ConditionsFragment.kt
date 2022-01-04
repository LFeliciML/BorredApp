package com.example.borredapp.ui.components.mainActivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.databinding.ConditionsFragmentBinding

class ConditionsFragment : Fragment() {

    private lateinit var binding: ConditionsFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ConditionsFragmentBinding.inflate(layoutInflater)

        //event buton back at initialFragment
        binding.bBack.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,InitialFragment()).commit()
        }
        return binding.root
    }


}