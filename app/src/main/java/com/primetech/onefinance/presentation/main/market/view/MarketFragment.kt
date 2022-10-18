package com.primetech.onefinance.presentation.main.market.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.primetech.onefinance.data.Utility
import com.primetech.onefinance.databinding.FragmentMarketBinding
import com.primetech.onefinance.presentation.main.market.adapter.MarketAdapter

class MarketFragment : Fragment() {

    private lateinit var binding : FragmentMarketBinding

    private lateinit var marketAdapter: MarketAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMarketBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setAdapter()
        marketAdapter.clearData()
        marketAdapter.setData(Utility.allMarket)
        Log.d("Market Fragment", "onViewCreated")
    }

    private fun setAdapter(){
        marketAdapter = MarketAdapter()
        binding.rvAllMarket.adapter = marketAdapter
        binding.rvAllMarket.layoutManager = LinearLayoutManager(context)
        binding.rvAllMarket.setHasFixedSize(true)
    }

}