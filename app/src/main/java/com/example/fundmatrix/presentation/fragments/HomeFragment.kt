package com.example.fundmatrix.presentation.fragments

import androidx.navigation.fragment.findNavController
import com.example.fundmatrix.R
import com.example.fundmatrix.databinding.FragmentHomeBinding
import com.example.fundmatrix.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun prepareUI() {
        findNavController().navigate(R.id.action_homeFragment_to_transactionFragment)
    }

}