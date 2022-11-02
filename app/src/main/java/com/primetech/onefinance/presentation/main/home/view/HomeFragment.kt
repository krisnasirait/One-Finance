package com.primetech.onefinance.presentation.main.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.primetech.onefinance.data.Utility
import com.primetech.onefinance.databinding.FragmentHomeBinding
import com.primetech.onefinance.presentation.main.home.adapter.TopHomeAdapter
import com.primetech.onefinance.presentation.main.home.adapter.TrendingAdapter

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    private lateinit var adapterTopHome : TopHomeAdapter

    private lateinit var adapterTrending : TrendingAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
        adapterTopHome.clearData()
        adapterTopHome.setData(Utility.topHome)
        adapterTrending.clearData()
        adapterTrending.setData(Utility.trending)
    }

    private fun setAdapter(){
        adapterTopHome = TopHomeAdapter()
        binding.rvTopHome.adapter = adapterTopHome
        binding.rvTopHome.layoutManager = GridLayoutManager(context,3)

        adapterTrending = TrendingAdapter()
        binding .rvTrendingHome.adapter = adapterTrending
        binding .rvTrendingHome.layoutManager = LinearLayoutManager(context)

    }

}