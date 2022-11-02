package com.primetech.onefinance.presentation.main.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.primetech.onefinance.data.model.Trending
import com.primetech.onefinance.databinding.ItemTrendingBinding

class TrendingAdapter : RecyclerView.Adapter<TrendingAdapter.TrendingViewHolder>() {

    private var itemTrending = mutableListOf<Trending>()

    inner class TrendingViewHolder (val binding : ItemTrendingBinding) :
        RecyclerView.ViewHolder (binding.root) {

            fun bind(item : Trending){

            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        return TrendingViewHolder(ItemTrendingBinding.inflate(
            LayoutInflater.from(parent.context),parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: TrendingViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return itemTrending.size
    }
}