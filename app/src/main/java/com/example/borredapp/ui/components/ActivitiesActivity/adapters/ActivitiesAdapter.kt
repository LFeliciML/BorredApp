package com.example.borredapp.ui.components.ActivitiesActivity.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.borredapp.R

class ActivitiesAdapter(private var activitiesList : List<String>): RecyclerView.Adapter<ActivitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivitiesViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return ActivitiesViewHolder(layoutInflater.inflate(R.layout.item_activity,parent,false))
    }

    override fun onBindViewHolder(holder: ActivitiesViewHolder, position: Int) {
        holder.setItems(activitiesList[position])
    }

    override fun getItemCount(): Int = activitiesList.size

}