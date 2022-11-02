package com.primetech.onefinance.presentation.main.home.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.primetech.onefinance.data.Utility
import com.primetech.onefinance.databinding.FragmentHomeBinding
import com.primetech.onefinance.presentation.main.home.adapter.TopHomeAdapter

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    private lateinit var adapter : TopHomeAdapter

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
        adapter.clearData()
        adapter.setData(Utility.topHome)
    }

    private fun setAdapter(){
        adapter = TopHomeAdapter()
        binding.rvTopHome.adapter = adapter
        binding.rvTopHome.layoutManager = GridLayoutManager(context,3)
    }

}