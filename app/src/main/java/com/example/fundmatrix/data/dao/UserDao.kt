package com.example.fundmatrix.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.fundmatrix.data.models.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Query("SELECT * FROM user_table WHERE id == :userId")
    fun getUser(userId: Int): LiveData<User>

    @Query("SELECT budget FROM user_table WHERE id = :userId")
    fun getBudgetForUser(userId: Int): LiveData<Long>
}