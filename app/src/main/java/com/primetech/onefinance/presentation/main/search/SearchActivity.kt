package com.primetech.onefinance.presentation.main.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.primetech.onefinance.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}