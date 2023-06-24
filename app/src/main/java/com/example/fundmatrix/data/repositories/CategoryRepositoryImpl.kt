package com.example.fundmatrix.data.repositories

import androidx.lifecycle.LiveData
import com.example.fundmatrix.data.dao.CategoryDao
import com.example.fundmatrix.data.models.Category

class CategoryRepositoryImpl(private val categoryDao: CategoryDao) : CategoryRepository {
    override suspend fun addCategory(category: Category) {
        return categoryDao.addCategory(category)
    }

    override fun getCategoryById(categoryId: Int): LiveData<Category> {
        return categoryDao.getCategoryById(categoryId)
    }

    override fun getAllCategories(): LiveData<List<Category>> {
        return categoryDao.getAllCategories()
    }
}