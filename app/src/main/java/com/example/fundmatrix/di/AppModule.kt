package com.example.fundmatrix.di

import com.example.fundmatrix.presentation.viewmodels.HomeViewModel
import com.example.fundmatrix.presentation.viewmodels.TransactionViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get(), get(), get()) }
    viewModel { TransactionViewModel(get(), get(), get()) }
}