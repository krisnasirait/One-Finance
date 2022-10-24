package com.primetech.onefinance.presentation.main.wallet.portofolio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.primetech.onefinance.databinding.ItemPortofolioBinding

class PortofolioAdapter : RecyclerView.Adapter<PortofolioAdapter.ViewHolder>() {

    private lateinit var binding: ItemPortofolioBinding
    private val listPortofolio = mutableListOf<Portofolio>()

    inner class ViewHolder(private val itemBinding: ItemPortofolioBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(portofolio: Portofolio) {
            Glide.with(binding.root)
                .load(portofolio.symbols)
                .into(binding.ivLogo)
            itemBinding.tvTitle.text = portofolio.coinName
            itemBinding.tvAmountHave.text = portofolio.amountCoin
            itemBinding.tvInUsd.text = portofolio.amountInUsd
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemPortofolioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listPortofolio[position])
    }

    override fun getItemCount(): Int {
        return listPortofolio.size
    }

    fun setData(item: List<Portofolio>) {
        listPortofolio.addAll(item)
        notifyDataSetChanged()
    }
}