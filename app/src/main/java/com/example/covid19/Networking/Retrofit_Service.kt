package com.example.covid19.Networking

import com.example.covid19.Networking.data.CovidDataResponse
import retrofit2.Response
import retrofit2.http.GET

interface Retrofit_Service {
    @GET("data.json")
   suspend fun getCovidList():Response<CovidDataResponse>
}