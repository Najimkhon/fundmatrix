package com.example.fundmatrix.presentation.fragments

import androidx.navigation.fragment.findNavController
import com.example.fundmatrix.R
import com.example.fundmatrix.databinding.FragmentWelcomeBinding
import com.example.fundmatrix.presentation.base.BaseFragment

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(FragmentWelcomeBinding::inflate) {
    override fun prepareUI() {
        findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
    }
}