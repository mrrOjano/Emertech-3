package com.example.couper

import android.os.Bundle
import android.view.View
import android.view.View.inflate
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.couper.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binidng: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }



}