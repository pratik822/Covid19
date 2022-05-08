package com.example.covid19.Networking.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CasesTimeSery(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo
    val dailyconfirmed: String,
    @ColumnInfo
    val dailydeceased: String,
    @ColumnInfo
    val dailyrecovered: String,
    @ColumnInfo
    val date: String,
    @ColumnInfo
    val dateymd: String,
    @ColumnInfo
    val totalconfirmed: String,
    @ColumnInfo
    val totaldeceased: String,
    @ColumnInfo
    val totalrecovered: String
)