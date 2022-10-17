package com.primetech.onefinance.wallet

import android.content.Context
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
}