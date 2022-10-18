package com.primetech.onefinance.presentation.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primetech.onefinance.databinding.ActivitySignUpBinding
import com.primetech.onefinance.presentation.branding.landingpage.LandingPageActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setOnClickListener()
    }

    private fun setOnClickListener(){
        binding.ivBack.setOnClickListener {
            Intent(this, LandingPageActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.tvLogin.setOnClickListener {
            Intent(this, LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}