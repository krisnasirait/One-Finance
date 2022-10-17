package com.primetech.onefinance.presentation.main.market.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.primetech.onefinance.databinding.FragmentMarketBinding

class MarketFragment : Fragment() {

    private lateinit var binding : FragmentMarketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMarketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}