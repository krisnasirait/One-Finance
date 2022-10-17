package com.primetech.onefinance.presentation.branding.landingpage.fragmentlanding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.primetech.onefinance.MainActivity
import com.primetech.onefinance.databinding.FragmentThirdLandingBinding
import com.primetech.onefinance.presentation.auth.LoginActivity
import com.primetech.onefinance.presentation.auth.SignUpActivity

class ThirdLandingFragment : Fragment() {

    private lateinit var binding : FragmentThirdLandingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdLandingBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClickListener()
    }

    private fun setOnClickListener(){
        binding.tvSkip.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }

        binding.btnSignIn.setOnClickListener {
            Intent(context, LoginActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.btnSignUp.setOnClickListener {
            Intent(context, SignUpActivity::class.java).also {
                startActivity(it)
            }
        }
    }

}