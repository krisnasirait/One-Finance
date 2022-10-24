package com.primetech.onefinance.presentation.main.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}