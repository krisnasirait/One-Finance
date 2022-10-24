package com.primetech.onefinance.presentation.main.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.primetech.onefinance.R
import com.primetech.onefinance.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBuy.setOnClickListener {
            showDialogBuy()
        }
    }

    private fun showDialogBuy() {
        val view = LayoutInflater.from(this).inflate(R.layout.custom_buy_dialog, null, false)
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setView(view)

        val dialog = dialogBuilder.create()

        dialog.show()
    }
}