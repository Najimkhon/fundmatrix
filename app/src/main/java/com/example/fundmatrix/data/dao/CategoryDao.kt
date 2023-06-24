package com.example.fundmatrix.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.fundmatrix.data.models.Category

@Dao
interface CategoryDao {
    @Insert
    suspend fun addCategory(category: Category)

    @Query("SELECT * FROM category_table WHERE id = :categoryId")
    fun getCategoryById(categoryId: Int): LiveData<Category>

    @Query("SELECT * FROM category_table")
    fun getAllCategories(): LiveData<List<Category>>
}