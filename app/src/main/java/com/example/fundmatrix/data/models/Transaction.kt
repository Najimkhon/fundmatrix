package com.example.fundmatrix.data.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "transaction_table")
@Parcelize
data class Transaction(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val userId: Int,
    val categoryId: Int,
    var amount: Long,
    val date: String
) : Parcelable
