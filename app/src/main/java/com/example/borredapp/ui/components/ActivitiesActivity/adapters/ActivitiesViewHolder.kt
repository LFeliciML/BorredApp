package com.example.borredapp.ui.components.ActivitiesActivity.adapters

import android.view.View
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.borredapp.databinding.ItemActivityBinding
import com.example.borredapp.ui.components.ActivitiesActivity.fragments.ListActivitiesFragmentDirections

class ActivitiesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val vista:View = view
    private val binding = ItemActivityBinding.bind(view)

    fun setItems(activity: String){
        binding.activityName.text = activity
        itemView.setOnClickListener {
            val action = ListActivitiesFragmentDirections.actionListActivitiesFragmentToSuggestionFragment(activity)
            val navController = Navigation.findNavController(vista)
            navController.navigate(action)
        }
    }
}
