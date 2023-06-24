package com.example.fundmatrix.data.repositories

import androidx.lifecycle.LiveData
import com.example.fundmatrix.data.dao.TransactionDao
import com.example.fundmatrix.data.models.Transaction

class TransactionRepositoryImpl(private val transactionDao: TransactionDao) : TransactionRepository {
    override suspend fun addTransaction(transaction: Transaction) {
        return transactionDao.addTransaction(transaction)
    }

    override suspend fun updateTransaction(transaction: Transaction) {
        return transactionDao.updateTransaction(transaction)
    }

    override suspend fun deleteTransaction(transaction: Transaction) {
        return transactionDao.deleteTransaction(transaction)
    }

    override fun getTransactionById(transactionId: Int): LiveData<Transaction> {
        return transactionDao.getTransactionById(transactionId)
    }

    override fun getAllTransactionsForUser(userId: Int): LiveData<List<Transaction>> {
        return transactionDao.getAllTransactionsForUser(userId)
    }

    override fun getTransactionsForUserByCategory(userId: Int, categoryId: Int): LiveData<List<Transaction>> {
        return transactionDao.getTransactionsForUserByCategory(userId, categoryId)
    }
}