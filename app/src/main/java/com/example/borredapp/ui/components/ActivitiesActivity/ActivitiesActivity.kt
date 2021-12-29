package com.example.borredapp.ui.components.ActivitiesActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.borredapp.R
import com.example.borredapp.databinding.ActivityActivitiesBinding

class ActivitiesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActivitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}