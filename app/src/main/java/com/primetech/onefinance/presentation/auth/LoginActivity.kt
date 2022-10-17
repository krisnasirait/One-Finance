package com.primetech.onefinance.presentation.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primetech.onefinance.databinding.ActivityLoginBinding

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
            finish()
        }
    }
}