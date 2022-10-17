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
    private lateinit var portofolioAdapter: PortofolioAdapter
    private lateinit var tradeHistoryAdapter: TradeHistoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentWalletBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        portofolioAdapter = PortofolioAdapter()
        tradeHistoryAdapter = TradeHistoryAdapter()

        binding.rvPortfolio.adapter = portofolioAdapter
        binding.rvTradeHistory.adapter = tradeHistoryAdapter

        binding.rvPortfolio.layoutManager =
            LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )

        binding.rvTradeHistory.layoutManager =
            LinearLayoutManager(
                context,
                LinearLayoutManager.VERTICAL,
                false
            )

        portofolioAdapter.setData(getPortofolio())
        tradeHistoryAdapter.setData(getTrade())
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