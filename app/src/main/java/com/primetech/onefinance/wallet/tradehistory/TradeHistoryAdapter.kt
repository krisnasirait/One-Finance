package com.primetech.onefinance.wallet.tradehistory

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ItemTradeHistoryBinding

class TradeHistoryAdapter(
    private val listTradeHistory: ArrayList<TradeHistory>,
    private val context: Context
) : RecyclerView.Adapter<TradeHistoryAdapter.ViewHolder>() {

    private lateinit var binding: ItemTradeHistoryBinding

    inner class ViewHolder(private val itemBinding: ItemTradeHistoryBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(tradeHistory: TradeHistory) {
            itemBinding.ivLogo.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_launcher_foreground
                )
            )
            itemBinding.tvAmount.text = tradeHistory.amountTrade.toString()
            itemBinding.tvPriceUSD.text = tradeHistory.price.toString()
            itemBinding.tvStatus.text = tradeHistory.status
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemTradeHistoryBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listTradeHistory[position])
    }

    override fun getItemCount(): Int {
        return listTradeHistory.size
    }

}