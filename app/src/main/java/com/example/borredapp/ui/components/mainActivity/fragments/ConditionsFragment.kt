package com.example.borredapp.ui.components.mainActivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.ui.components.mainActivity.viewmodel.ConditionsFragmentViewModel

class ConditionsFragment : Fragment() {

    private lateinit var viewModel: ConditionsFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tyc_fragment, container, false)
    }


}