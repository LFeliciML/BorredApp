package com.example.borredapp.ui.components.mainActivity.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.databinding.InitialFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.ActivitiesActivity
import com.example.borredapp.ui.components.mainActivity.viewmodel.InitialFragmentViewModel

class InitialFragment : Fragment() {

    private lateinit var binding: InitialFragmentBinding
    private lateinit var viewModel: InitialFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InitialFragmentBinding.inflate(layoutInflater)

        binding.buttonStart.setOnClickListener{
            val intent = Intent(this.context, ActivitiesActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }



}