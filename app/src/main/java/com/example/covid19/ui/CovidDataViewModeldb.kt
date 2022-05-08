package com.example.covid19.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.covid19.Networking.data.CasesTimeSery
import com.example.covid19.Networking.data.CovidDataResponse
import com.example.covid19.Networking.data.Statewise
import com.example.covid19.Networking.data.Tested
import com.example.covid19.Repository.DbRepository
import com.example.covid19.Repository.NetworkRepo
import com.example.covid19.utils.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject
@HiltViewModel
class CovidDataViewModeldb @Inject constructor(var repo: DbRepository):ViewModel() {

    fun getCaseTimeSeryData(): LiveData<List<CasesTimeSery>> {
       return repo.getCaseTimeSeryData();
    }

    fun getStatewiseData(): LiveData<List<Statewise>> {
        return repo.getStatewiseData();
    }

    fun gettestedData(): LiveData<List<Tested>> {
        return repo.gettestedData();
    }


}