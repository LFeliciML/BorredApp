package com.example.borredapp.ui.components.ActivitiesActivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.ui.components.ActivitiesActivity.viewmodel.SuggestionViewModel

class SuggestionFragment : Fragment() {


    private lateinit var viewModel: SuggestionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.suggestion_fragment, container, false)
    }


}