package com.example.covid19.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.covid19.Networking.data.CovidDataResponse
import com.example.covid19.Repository.NetworkRepo
import com.example.covid19.utils.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class CovidDataViewModel @Inject constructor(var repo: NetworkRepo):ViewModel() {

 init {
     viewModelScope.launch(Dispatchers.IO) {
         try {
             repo.getCovidData();
         }catch (e:Exception){
         e.toString();
         }

     }
 }
    fun getCovidData(): LiveData<CovidDataResponse>? {
       return repo.getCovidList;
    }


}