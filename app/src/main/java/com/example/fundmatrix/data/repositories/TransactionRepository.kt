package com.example.fundmatrix.data.repositories

import androidx.lifecycle.LiveData
import com.example.fundmatrix.data.models.Transaction

interface TransactionRepository {
    suspend fun addTransaction(transaction: Transaction)

    suspend fun updateTransaction(transaction: Transaction)

    suspend fun deleteTransaction(transaction: Transaction)

    fun getTransactionById(transactionId: Int): LiveData<Transaction>

    fun getAllTransactionsForUser(userId: Int): LiveData<List<Transaction>>

    fun getTransactionsForUserByCategory(userId: Int, categoryId: Int): LiveData<List<Transaction>>
}