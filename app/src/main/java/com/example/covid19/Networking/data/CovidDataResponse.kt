package com.example.covid19.Networking.data

import androidx.room.Entity

@Entity
data class CovidDataResponse(
    val cases_time_series: List<CasesTimeSery>,
    val statewise: List<Statewise>,
    val tested: List<Tested>
)