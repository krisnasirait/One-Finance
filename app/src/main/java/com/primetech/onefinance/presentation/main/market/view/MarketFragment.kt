package com.primetech.onefinance.presentation.main.market.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.primetech.onefinance.data.Utility
import com.primetech.onefinance.databinding.FragmentMarketBinding
import com.primetech.onefinance.presentation.main.market.adapter.MarketAdapter
import com.primetech.onefinance.presentation.main.search.SearchActivity

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
        setOnClickListener()
    }

    private fun setOnClickListener(){
        binding.ivSearchCoin.setOnClickListener {
            Intent(context,SearchActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun setAdapter(){
        marketAdapter = MarketAdapter()
        binding.rvAllMarket.adapter = marketAdapter
        binding.rvAllMarket.layoutManager = LinearLayoutManager(context)
        binding.rvAllMarket.setHasFixedSize(true)
    }

}