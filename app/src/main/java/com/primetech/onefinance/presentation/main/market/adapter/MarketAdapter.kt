package com.primetech.onefinance.presentation.main.market.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.primetech.onefinance.data.model.Market
import com.primetech.onefinance.databinding.ItemMarketBinding

class MarketAdapter : RecyclerView.Adapter<MarketAdapter.MarketViewHolder>() {

    private var itemMarket = mutableListOf<Market>()

    inner class MarketViewHolder (val binding : ItemMarketBinding)
        : RecyclerView.ViewHolder(binding.root) {

            fun bind (item : Market){
                Glide.with(binding.root)
                    .load(item.symbols)
                    .into(binding.ivLogo)
                binding.tvTitle.text = item.coinName
                binding.tvInUsd.text = item.amountInUsd
                binding.tvAmountHave.text = item.amountCoin
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        return MarketViewHolder(
            ItemMarketBinding.inflate(LayoutInflater.from(parent.context),
                parent,
                false)
        )
    }

    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        holder.bind(itemMarket[position])
    }

    override fun getItemCount(): Int {
        return itemMarket.size
    }

    fun clearData(){
        itemMarket.clear()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(item : List<Market>){
        itemMarket.addAll(item)
        notifyDataSetChanged()
    }
}