package com.primetech.onefinance.presentation.branding.landingpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ActivityLandingPageBinding
import com.primetech.onefinance.presentation.branding.landingpage.adapter.ViewPagerAdapter
import com.primetech.onefinance.presentation.branding.landingpage.fragmentlanding.FirstLandingFragment
import com.primetech.onefinance.presentation.branding.landingpage.fragmentlanding.SecondLandingFragment
import com.primetech.onefinance.presentation.branding.landingpage.fragmentlanding.ThirdLandingFragment

class LandingPageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLandingPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val logoAnimation = AnimationUtils.loadAnimation(this, R.anim.landing_page_animation)
        binding.ivLogoLandingUp.startAnimation(logoAnimation)
        binding.ivLogoLandingBot.startAnimation(logoAnimation)
        binding.ivLogoShadow.startAnimation(logoAnimation)

        setFragment()
    }

    private fun setFragment () {
        val fragment : ArrayList<Fragment> = arrayListOf(
            FirstLandingFragment(),
            SecondLandingFragment(),
            ThirdLandingFragment()
        )
        ViewPagerAdapter(fragment,this).also {
            binding.viewPager.adapter = it
        }
        binding.circleIndicator.setViewPager(binding.viewPager)
    }
}