package com.primetech.onefinance.presentation.branding.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ActivitySplashScreenBinding
import com.primetech.onefinance.presentation.branding.landingpage.LandingPageActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val aboveAnimation = AnimationUtils.loadAnimation(this, R.anim.above_num_animation)
        val belowAnimation = AnimationUtils.loadAnimation(this, R.anim.below_num_animation)
        val bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        binding.ivOneAbove.startAnimation(aboveAnimation)
        binding.ivOneBelow.startAnimation(belowAnimation)
        binding.ivOneFinance.startAnimation(bottomAnimation)

        binding.ivSplashDummy.alpha = 0f
        binding.ivSplashDummy.animate().setDuration(2700).alpha(1f).withEndAction{
            Intent(this, LandingPageActivity::class.java).also {
                startActivity(it)
            }
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}