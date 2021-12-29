package com.example.borredapp.ui.component.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.borredapp.R
import com.example.borredapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.title="Borred App"
    }
}