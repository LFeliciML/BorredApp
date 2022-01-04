package com.example.borredapp.ui.components.ActivitiesActivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.fragment.navArgs
import com.example.borredapp.R
import com.example.borredapp.databinding.SuggestionFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.viewmodel.SuggestionViewModel

class SuggestionFragment : Fragment() {

    private lateinit var viewModel: SuggestionViewModel
    private lateinit var binding: SuggestionFragmentBinding
    val args: SuggestionFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SuggestionFragmentBinding.inflate(layoutInflater)

        val activity = args.activity
        (requireActivity() as AppCompatActivity).supportActionBar?.title = activity
        //aca tambien iria la req
        if(activity=="random"){
            binding.activityTxt.isVisible = true
        }

        return binding.root
    }


}