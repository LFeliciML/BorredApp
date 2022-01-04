package com.example.borredapp.ui.components.mainActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.borredapp.R
import com.example.borredapp.databinding.ActivityMainBinding
import com.example.borredapp.ui.components.mainActivity.fragments.InitialFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.title="Borred App"
    }
}