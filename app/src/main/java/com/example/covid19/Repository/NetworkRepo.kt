package com.example.covid19.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.covid19.Networking.Retrofit_Service
import com.example.covid19.Networking.data.CovidDataResponse
import com.example.covid19.utils.DataState
import com.google.gson.Gson
import javax.inject.Inject

class NetworkRepo @Inject constructor(var retrofitService: Retrofit_Service,var dbRepository: DbRepository) {
    var covidListLiveData=MutableLiveData<CovidDataResponse>();
    suspend fun getCovidData():LiveData<CovidDataResponse>?{
        DataState.Loading;
        try {
            if(retrofitService.getCovidList()!=null && retrofitService.getCovidList().isSuccessful){
                retrofitService.getCovidList().body();
                covidListLiveData.postValue(retrofitService.getCovidList().body())
                DataState.success(retrofitService.getCovidList().body())
                retrofitService.getCovidList().body()
                println("hello"+Gson().toJson( retrofitService.getCovidList().body()))

                        dbRepository.db.covidDao().insertCaseTimeSery(
                            retrofitService.getCovidList().body()?.cases_time_series
                        );


                dbRepository.db.covidDao().insertStatewise(
                    retrofitService.getCovidList().body()?.statewise);
                dbRepository.db.covidDao().insertTested(
                    retrofitService.getCovidList().body()?.tested);

//

            }
        }catch (e:Exception){
            DataState.Error(e);
        }

        return covidListLiveData;
    }
    val getCovidList:LiveData<CovidDataResponse>
    get() = covidListLiveData;
}