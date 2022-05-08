package com.example.covid19.Repository

import androidx.lifecycle.LiveData
import com.example.covid19.Networking.data.CasesTimeSery
import com.example.covid19.Networking.data.Statewise
import com.example.covid19.Networking.data.Tested
import com.example.covid19.Networking.db.AppDatabase
import javax.inject.Inject

class DbRepository @Inject constructor(var db:AppDatabase) {

    suspend fun insertCaseTimeSeryData(casesTimeSery: List<CasesTimeSery>)=db.covidDao().insertCaseTimeSery(casesTimeSery)
    suspend fun insertStatewiseData(statewise: List<Statewise>)=db.covidDao().insertStatewise(statewise)
    suspend fun insertTestedData(tested: List<Tested>)=db.covidDao().insertTested(tested)


    fun getCaseTimeSeryData():LiveData<List<CasesTimeSery>>{
        return db.covidDao().getCasesTimeSeryData();
    }

    fun getStatewiseData():LiveData<List<Statewise>>{
        return db.covidDao().getStatewiseData();
    }

    fun gettestedData():LiveData<List<Tested>>{
        return db.covidDao().getTestedData();
    }
}