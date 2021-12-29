package com.example.borredapp.ui.component.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.borredapp.R
import com.example.borredapp.databinding.ActivityMainBinding
import com.example.borredapp.ui.component.main.fragments.InitialFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.title="Borred App"

        supportFragmentManager.beginTransaction().add(R.id.fragmentMainContainer,InitialFragment())

        /*No recuerdo como lo hizo el, era algo asi
        supportFragmentManager.commit {

        }*/
    }
}