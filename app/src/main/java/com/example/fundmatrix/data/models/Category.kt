package com.example.fundmatrix.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "category_table")
@Parcelize
data class Category(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String
) : Parcelable
