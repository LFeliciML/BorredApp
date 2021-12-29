package com.example.borredapp.ui.components.ActivitiesActivity.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.ui.components.ActivitiesActivity.viewmodel.ListActivitiesViewModel

class ListActivitiesFragment : Fragment() {

    private lateinit var viewModel: ListActivitiesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activities_list_fragment, container, false)
    }


}