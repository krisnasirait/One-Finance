package com.primetech.onefinance.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.primetech.onefinance.databinding.FragmentWalletBinding
import com.primetech.onefinance.wallet.portofolio.Portofolio
import com.primetech.onefinance.wallet.portofolio.PortofolioAdapter
import com.primetech.onefinance.wallet.tradehistory.TradeHistory
import com.primetech.onefinance.wallet.tradehistory.TradeHistoryAdapter

class WalletFragment : Fragment() {

    private lateinit var binding: FragmentWalletBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWalletBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listPortofolio = getPortofolio()
        val listTrade = getTrade()

        val portoAdapter = PortofolioAdapter(listPortofolio, requireContext())
        val tradeAdapter = TradeHistoryAdapter(listTrade, requireContext())

        binding.rvPortfolio.layoutManager =
            LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )

        binding.rvTradeHistory.layoutManager =
            LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )

        binding.rvPortfolio.adapter = portoAdapter
        binding.rvTradeHistory.adapter = tradeAdapter

    }

    private fun getPortofolio(): ArrayList<Portofolio> {
        val portoData1 = Portofolio("Bitcoin", "1.34", "$ 40, 623")

        val listPorto = ArrayList<Portofolio>()
        listPorto.add(portoData1)
        return listPorto
    }

    private fun getTrade(): ArrayList<TradeHistory> {
        val tradeData1 = TradeHistory(3.245, 2500, "Filled")

        val listTrade = ArrayList<TradeHistory>()
        listTrade.add(tradeData1)
        return listTrade

    }
}