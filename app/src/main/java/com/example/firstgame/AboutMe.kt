package com.example.firstgame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstgame.databinding.ActivityAboutMeBinding

class AboutMe : AppCompatActivity() {

    private lateinit var binding: ActivityAboutMeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityAboutMeBinding.inflate(inflater)
        setContentView(binding.root)
    }
}