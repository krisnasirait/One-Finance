package com.primetech.onefinance.presentation.main.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.primetech.onefinance.data.model.Trending
import com.primetech.onefinance.databinding.ItemTopHomeBinding

class TopHomeAdapter : RecyclerView.Adapter<TopHomeAdapter.TopHomeViewHolder>() {

    private var itemTopHome = mutableListOf<Trending>()

    inner class TopHomeViewHolder (val binding : ItemTopHomeBinding) :
        RecyclerView.ViewHolder(binding.root)  {

            fun bind (item : Trending){
                Glide.with(binding.root)
                    .load(item.symbols)
                    .into(binding.ivCoinLogo)

                binding.tvCoinName.text = item.coinName

                binding.tvCoinAcronym.text = item.acronym

                binding.tvCoinPrice.text = item.price
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopHomeViewHolder {
        return TopHomeViewHolder(ItemTopHomeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: TopHomeViewHolder, position: Int) {
        holder.bind(itemTopHome[position])
    }

    override fun getItemCount(): Int {
        return itemTopHome.size
    }

    fun clearData () {
        itemTopHome.clear()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData (item : List<Trending>){
        itemTopHome.addAll(item)
        notifyDataSetChanged()
    }
}