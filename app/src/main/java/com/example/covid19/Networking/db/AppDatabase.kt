package com.example.covid19.Networking.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.covid19.Networking.data.CasesTimeSery
import com.example.covid19.Networking.data.Statewise
import com.example.covid19.Networking.data.Tested

@Database(entities =[CasesTimeSery::class,Statewise::class,Tested::class],version = 1 )
abstract class AppDatabase:RoomDatabase() {
    abstract fun covidDao():CovidDao;
}