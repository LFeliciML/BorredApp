package com.example.borredapp.ui.components.ActivitiesActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.borredapp.R
import com.example.borredapp.databinding.ActivityActivitiesBinding
import com.example.borredapp.databinding.ActivityMainBinding
import com.example.borredapp.ui.components.ActivitiesActivity.fragments.ListActivitiesFragment
import com.example.borredapp.ui.components.mainActivity.fragments.InitialFragment

class ActivitiesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActivitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActivitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerViewActivities, ListActivitiesFragment())
            .commit()


    }
}