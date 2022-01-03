package com.example.borredapp.ui.components.ActivitiesActivity.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.borredapp.R
import com.example.borredapp.databinding.ItemActivityBinding
import com.example.borredapp.ui.components.ActivitiesActivity.adapters.ActivitiesViewHolder

class ActivitiesAdapter(private var activitiesList : List<String>): RecyclerView.Adapter<ActivitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {
        //val binding = ItemActivityBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        val layoutInflater = LayoutInflater.from(parent.context)
        return ActivitiesViewHolder(layoutInflater.inflate(R.layout.item_activity,parent,false))
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {
        holder.setItems(activitiesList[position])
    }

    override fun getItemCount(): Int = activitiesList.size

}