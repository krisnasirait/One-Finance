package com.primetech.onefinance.presentation.main.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.primetech.onefinance.data.model.Trending
import com.primetech.onefinance.databinding.ItemTrendingBinding

class TrendingAdapter : RecyclerView.Adapter<TrendingAdapter.TrendingViewHolder>() {

    private var itemTrending = mutableListOf<Trending>()

    inner class TrendingViewHolder (val binding : ItemTrendingBinding) :
        RecyclerView.ViewHolder (binding.root) {

            fun bind(item : Trending){
                Glide.with(binding.root)
                    .load(item.symbols)
                    .into(binding.ivLogo)

                binding.tvTitle.text = item.coinName
                binding.tvAcroynim.text = item.acronym
                binding.tv1h.text = item.change1Hour
                binding.tv24h.text = item.change24Hour
                binding.tv7d.text = item.change7Days
                binding.tvPrice.text = item.price
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingViewHolder {
        return TrendingViewHolder(ItemTrendingBinding.inflate(
            LayoutInflater.from(parent.context),parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: TrendingViewHolder, position: Int) {
        holder.bind(itemTrending[position])
    }

    override fun getItemCount(): Int {
        return itemTrending.size
    }

    private fun clearData (){
        itemTrending.clear()
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setData (item : List<Trending>){
        itemTrending.addAll(item)
        notifyDataSetChanged()
    }
}