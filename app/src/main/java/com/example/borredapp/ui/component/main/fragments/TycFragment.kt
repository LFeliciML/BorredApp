package com.example.borredapp.ui.component.main.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.borredapp.R
import com.example.borredapp.ui.component.main.viewmodel.TycViewModel

class TycFragment : Fragment() {

    companion object {
        fun newInstance() = TycFragment()
    }

    private lateinit var viewModel: TycViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tyc_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TycViewModel::class.java)
        // TODO: Use the ViewModel
    }

}