package com.example.covid19.Networking.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Statewise(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo
    val active: String,
    @ColumnInfo
    val confirmed: String,
    @ColumnInfo
    val deaths: String,
    @ColumnInfo
    val deltaconfirmed: String,
    @ColumnInfo
    val deltadeaths: String,
    @ColumnInfo
    val deltarecovered: String,
    @ColumnInfo
    val lastupdatedtime: String,
    @ColumnInfo
    val migratedother: String,
    @ColumnInfo
    val recovered: String,
    @ColumnInfo
    val state: String,
    @ColumnInfo
    val statecode: String,
    @ColumnInfo
    val statenotes: String
)