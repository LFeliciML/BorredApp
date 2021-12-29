package com.example.borredapp.ui.component.activitiesactivity.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.ui.component.activitiesactivity.viewmodel.ActivitiesListViewModel

class ActivitiesListFragment : Fragment() {

    companion object {
        fun newInstance() = ActivitiesListFragment()
    }

    private lateinit var viewModel: ActivitiesListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activities_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ActivitiesListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}