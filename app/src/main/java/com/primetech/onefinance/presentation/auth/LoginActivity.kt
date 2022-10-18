package com.primetech.onefinance.presentation.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primetech.onefinance.databinding.ActivityLoginBinding
import com.primetech.onefinance.presentation.branding.landingpage.LandingPageActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setOnClickListener()
    }

    private fun setOnClickListener(){
        binding.ivBack.setOnClickListener {
            Intent(this,LandingPageActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.tvSignUp.setOnClickListener {
            Intent(this, SignUpActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}