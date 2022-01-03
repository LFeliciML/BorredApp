package com.example.borredapp.ui.components.ActivitiesActivity.adapters

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.borredapp.databinding.ItemActivityBinding

class ActivitiesViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemActivityBinding.bind(view)

    fun setItems(activity: String){
        //El nombre se deberia pasar tambien a la otra activity
        binding.activityName.text = activity
        itemView.setOnClickListener {
            //navegar...

        }
    }
}
