package com.example.borredapp.ui.components.mainActivity.fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.borredapp.R
import com.example.borredapp.data.RepositoryImp
import com.example.borredapp.databinding.InitialFragmentBinding
import com.example.borredapp.domain.ActivityInteractor
import com.example.borredapp.ui.components.ActivitiesActivity.ActivitiesActivity
import com.example.borredapp.ui.components.mainActivity.viewmodel.InitialFragmentViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class InitialFragment : Fragment() {

    private lateinit var binding: InitialFragmentBinding
    private lateinit var viewModel: InitialFragmentViewModel //by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = InitialFragmentBinding.inflate(layoutInflater)

        binding.buttonStart.setOnClickListener{
            val intent = Intent(this.context, ActivitiesActivity::class.java)
            startActivity(intent)
        }

        val interactor = ActivityInteractor(RepositoryImp())


        lifecycleScope.launch(Dispatchers.Main) {
//            viewModel.pruebaApi()
            println(interactor.getActivityRandom())

        }

        return binding.root
    }



}