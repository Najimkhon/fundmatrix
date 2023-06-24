package com.example.fundmatrix.di

import androidx.room.Room
import com.example.fundmatrix.data.db.AppDatabase
import com.example.fundmatrix.data.repositories.CategoryRepository
import com.example.fundmatrix.data.repositories.CategoryRepositoryImpl
import com.example.fundmatrix.data.repositories.TransactionRepository
import com.example.fundmatrix.data.repositories.TransactionRepositoryImpl
import com.example.fundmatrix.data.repositories.UserRepository
import com.example.fundmatrix.data.repositories.UserRepositoryImpl
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            get(), AppDatabase::class.java, "app_database"
        ).build()
    }

    single { get<AppDatabase>().userDao() }
    single { get<AppDatabase>().categoryDao() }
    single { get<AppDatabase>().transactionDao() }

    single<UserRepository> { UserRepositoryImpl(get()) }
    single<CategoryRepository> { CategoryRepositoryImpl(get()) }
    single<TransactionRepository> { TransactionRepositoryImpl(get()) }
}