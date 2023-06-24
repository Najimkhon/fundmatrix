package com.example.fundmatrix.data.repositories

import androidx.lifecycle.LiveData
import com.example.fundmatrix.data.models.Category

interface CategoryRepository {
    suspend fun addCategory(category: Category)

    fun getCategoryById(categoryId: Int): LiveData<Category>

    fun getAllCategories(): LiveData<List<Category>>
}