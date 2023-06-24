package com.example.fundmatrix.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fundmatrix.data.dao.CategoryDao
import com.example.fundmatrix.data.dao.TransactionDao
import com.example.fundmatrix.data.dao.UserDao
import com.example.fundmatrix.data.models.Category
import com.example.fundmatrix.data.models.Transaction
import com.example.fundmatrix.data.models.User


@Database(entities = [User::class, Category::class, Transaction::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun categoryDao(): CategoryDao
    abstract fun transactionDao(): TransactionDao
}