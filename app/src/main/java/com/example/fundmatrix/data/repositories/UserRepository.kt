package com.example.fundmatrix.data.repositories

import androidx.lifecycle.LiveData
import com.example.fundmatrix.data.models.User

interface UserRepository {
    suspend fun addUser(user: User)

    suspend fun updateUser(user: User)

    fun getUser(userId: Int): LiveData<User>

    fun getBudgetForUser(userId: Int): LiveData<Long>
}