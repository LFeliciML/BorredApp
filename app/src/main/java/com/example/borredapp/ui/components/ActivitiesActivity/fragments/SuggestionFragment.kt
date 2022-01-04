package com.example.borredapp.ui.components.ActivitiesActivity.fragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.borredapp.R
import com.example.borredapp.data.Repository
import com.example.borredapp.databinding.SuggestionFragmentBinding
import com.example.borredapp.domain.ActivityInteractor
import com.example.borredapp.ui.components.ActivitiesActivity.viewmodel.SuggestionViewModel

class SuggestionFragment : Fragment() {

    val viewModel: SuggestionViewModel by viewModels()
    private lateinit var binding: SuggestionFragmentBinding
    private val args: SuggestionFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SuggestionFragmentBinding.inflate(layoutInflater)

        val fromActivity = args.activity
        (requireActivity() as AppCompatActivity).supportActionBar?.title = fromActivity

//        viewModel = ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(
//            Application()
//        )).get(SuggestionViewModel::class.java)


        viewModel.req(fromActivity)

        viewModel.data.observe(viewLifecycleOwner,{
            binding.participantsTxt.text = it.participants.toString()
            binding.priceTxt.text = setPrice(it.price)
            binding.activityTxt.text = it.activity
            if(fromActivity=="random"){
                binding.activityTxt.isVisible = true
                binding.activityTxt.text = it.activity
            }
        })

        binding.tryAgainBtn.setOnClickListener {
            viewModel.req(fromActivity)
        }


        return binding.root
    }

    private fun setPrice(price: Float):String{
        return when(price){
            0.0f -> "Free"
            0.1f, 0.2f, 0.3f -> "Low"
            0.4f, 0.5f, 0.6f -> "Medium"
            else -> "High"
        }
    }


}