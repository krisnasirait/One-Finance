package com.primetech.onefinance.presentation.branding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primetech.onefinance.databinding.ActivityLandingPageBinding

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}