package com.example.covid19.Networking.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.covid19.Networking.data.CasesTimeSery
import com.example.covid19.Networking.data.Statewise
import com.example.covid19.Networking.data.Tested

@Dao
interface CovidDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCaseTimeSery(objects: List<CasesTimeSery>?)

    @Query("SELECT * FROM CasesTimeSery")
    fun getCasesTimeSeryData():LiveData<List<CasesTimeSery>>;

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStatewise(objects: List<Statewise>?)


    @Query("SELECT * FROM Statewise")
    fun getStatewiseData():LiveData<List<Statewise>>;

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTested(objects: List<Tested>?)

    @Query("SELECT * FROM Tested")
    fun getTestedData():LiveData<List<Tested>>;

}