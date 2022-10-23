package com.primetech.onefinance.presentation.main.wallet.tradehistory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.primetech.onefinance.databinding.ItemTradeHistoryBinding

class TradeHistoryAdapter : RecyclerView.Adapter<TradeHistoryAdapter.ViewHolder>() {

    private lateinit var binding: ItemTradeHistoryBinding
    private val listTrade = mutableListOf<TradeHistory>()

    inner class ViewHolder(private val itemBinding: ItemTradeHistoryBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(tradeHistory: TradeHistory) {
            Glide.with(binding.root)
                .load(tradeHistory.symbols)
                .into(binding.ivLogo)
            itemBinding.tvAmount.text = tradeHistory.amountTrade.toString()
            itemBinding.tvPriceUSD.text = tradeHistory.price.toString()
            itemBinding.tvStatus.text = tradeHistory.status
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemTradeHistoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTrade[position])
    }

    override fun getItemCount(): Int {
        return listTrade.size
    }

    fun setData(item: List<TradeHistory>) {
        listTrade.addAll(item)
        notifyDataSetChanged()
    }

}