package com.example.borredapp.ui.components.ActivitiesActivity.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.borredapp.databinding.SuggestionFragmentBinding
import com.example.borredapp.ui.components.ActivitiesActivity.viewmodel.SuggestionViewModel

class SuggestionFragment : Fragment() {


    private lateinit var binding: SuggestionFragmentBinding
    private val args: SuggestionFragmentArgs by navArgs()
    private val viewModel = SuggestionViewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SuggestionFragmentBinding.inflate(layoutInflater)

        val fromActivity = args.activity
        (requireActivity() as AppCompatActivity).supportActionBar?.title = fromActivity


        if (fromActivity.lowercase()!="random"){

            viewModel.req(fromActivity)
        }



        viewModel.dataResponse.observe(viewLifecycleOwner,{
            binding.participantsTxt.text = it?.participants.toString()
            binding.priceTxt.text = it?.price.toString()
            binding.activityTxt.text = it?.activity.toString()
            if(fromActivity=="random"){
                binding.activityTxt.isVisible = true
                binding.activityTxt.text = it?.activity.toString()
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