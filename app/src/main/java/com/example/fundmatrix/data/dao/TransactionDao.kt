package com.example.fundmatrix.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.fundmatrix.data.models.Transaction

@Dao
interface TransactionDao {
    @Insert
    suspend fun addTransaction(transaction: Transaction)

    @Update
    suspend fun updateTransaction(transaction: Transaction)

    @Delete
    suspend fun deleteTransaction(transaction: Transaction)

    @Query("SELECT * FROM transaction_table WHERE id = :transactionId")
    fun getTransactionById(transactionId: Int): LiveData<Transaction>

    @Query("SELECT * FROM transaction_table WHERE userId = :userId")
    fun getAllTransactionsForUser(userId: Int): LiveData<List<Transaction>>

    @Query("SELECT * FROM transaction_table WHERE userId = :userId AND categoryId = :categoryId")
    fun getTransactionsForUserByCategory(userId: Int, categoryId: Int): LiveData<List<Transaction>>
}