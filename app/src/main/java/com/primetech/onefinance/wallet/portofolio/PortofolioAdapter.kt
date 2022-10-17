package com.primetech.onefinance.wallet.portofolio

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ItemPortofolioBinding

class PortofolioAdapter(
    private val listCoin: ArrayList<Portofolio>,
    private val context: Context
) : RecyclerView.Adapter<PortofolioAdapter.ViewHolder>() {

    private lateinit var binding: ItemPortofolioBinding

    inner class ViewHolder(private val itemBinding: ItemPortofolioBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(portofolio: Portofolio) {
            itemBinding.ivLogo.setImageDrawable(
                ContextCompat.getDrawable(
                    context,
                    R.drawable.ic_launcher_foreground
                )
            )
            itemBinding.tvTitle.text = portofolio.coiName
            itemBinding.tvAmountHave.text = portofolio.amountCoin
            itemBinding.tvInUsd.text = portofolio.amountInUsd
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemPortofolioBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCoin[position])
    }

    override fun getItemCount(): Int {
        return listCoin.size
    }
}