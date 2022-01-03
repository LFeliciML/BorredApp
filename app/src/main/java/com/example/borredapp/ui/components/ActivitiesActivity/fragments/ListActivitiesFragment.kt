package com.example.borredapp.ui.components.ActivitiesActivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.ui.components.ActivitiesActivity.viewmodel.ListActivitiesViewModel
import com.example.borredapp.databinding.ActivitiesListFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.adapters.ActivitiesAdapter
import androidx.appcompat.app.AppCompatActivity




class ListActivitiesFragment : Fragment() {

    private lateinit var viewModel: ListActivitiesViewModel
    private lateinit var binding: ActivitiesListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivitiesListFragmentBinding.inflate(layoutInflater)

        (requireActivity() as AppCompatActivity).supportActionBar?.hide()

        val activitiesList = listOf(
            "Education",
            "Recreational",
            "Social",
            "Diy",
            "Charity",
            "Cooking",
            "Relaxation",
            "Music",
            "Busywork"
        )

        val adapter = ActivitiesAdapter(activitiesList)
        binding.activitiesRv.adapter = adapter



        return binding.root
    }


}