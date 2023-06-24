package com.example.fundmatrix.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.fundmatrix.data.repositories.CategoryRepository
import com.example.fundmatrix.data.repositories.TransactionRepository
import com.example.fundmatrix.data.repositories.UserRepository

class TransactionViewModel(
    private val userRepository: UserRepository,
    categoryRepository: CategoryRepository,
    transactionRepository: TransactionRepository
) : ViewModel() {
}