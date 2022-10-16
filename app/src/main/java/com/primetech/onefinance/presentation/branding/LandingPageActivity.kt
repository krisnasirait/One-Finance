package com.primetech.onefinance.presentation.branding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ActivityLandingPageBinding

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val logoAnimation = AnimationUtils.loadAnimation(this, R.anim.landing_page_animation)

        binding.ivLogoLandingUp.startAnimation(logoAnimation)
        binding.ivLogoLandingBot.startAnimation(logoAnimation)

    }
}