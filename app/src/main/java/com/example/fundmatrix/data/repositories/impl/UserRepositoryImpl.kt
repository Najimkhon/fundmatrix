package com.example.fundmatrix.data.repositories.impl

import androidx.lifecycle.LiveData
import com.example.fundmatrix.data.dao.UserDao
import com.example.fundmatrix.data.models.User
import com.example.fundmatrix.data.repositories.UserRepository

class UserRepositoryImpl(
    private val userDao: UserDao
) : UserRepository {
    override suspend fun addUser(user: User) {
        return userDao.addUser(user)
    }

    override suspend fun updateUser(user: User) {
        return userDao.updateUser(user)
    }

    override fun getUser(userId: Int): LiveData<User> {
        return userDao.getUser(userId)
    }

    override fun getBudgetForUser(userId: Int): LiveData<Long> {
        return userDao.getBudgetForUser(userId)
    }
}