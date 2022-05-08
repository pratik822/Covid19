package com.example.covid19.Networking.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tested(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo
    val dailyrtpcrsamplescollectedicmrapplication: String,
    @ColumnInfo
    val firstdoseadministered: String,
    @ColumnInfo
    val frontlineworkersvaccinated1stdose: String,
    @ColumnInfo
    val frontlineworkersvaccinated2nddose: String,
    @ColumnInfo
    val healthcareworkersvaccinated1stdose: String,
    @ColumnInfo
    val healthcareworkersvaccinated2nddose: String,
    @ColumnInfo
    val over45years1stdose: String,
    @ColumnInfo
    val over45years2nddose: String,
    @ColumnInfo
    val over60years1stdose: String,
    @ColumnInfo
    val over60years2nddose: String,
    @ColumnInfo
    val positivecasesfromsamplesreported: String,
    @ColumnInfo
    val registrationabove45years: String,
    @ColumnInfo
    val registrationflwhcw: String,
    @ColumnInfo
    val registrationonline: String,
    @ColumnInfo
    val registrationonspot: String,
    @ColumnInfo
    val samplereportedtoday: String,
    @ColumnInfo
    val seconddoseadministered: String,
    @ColumnInfo
    val source: String,
    @ColumnInfo
    val source2: String,
    @ColumnInfo
    val source3: String,
    @ColumnInfo
    val source4: String,
    @ColumnInfo
    val testedasof: String,
    @ColumnInfo
    val testsconductedbyprivatelabs: String,
    @ColumnInfo
    val totaldosesadministered: String,
    @ColumnInfo
    val totaldosesavailablewithstates: String,
    @ColumnInfo
    val totaldosesavailablewithstatesprivatehospitals: String,
    @ColumnInfo
    val totaldosesinpipeline: String,
    @ColumnInfo
    val totaldosesprovidedtostatesuts: String,
    @ColumnInfo
    val totalindividualsregistered: String,
    @ColumnInfo
    val totalindividualstested: String,
    @ColumnInfo
    val totalpositivecases: String,
    @ColumnInfo
    val totalrtpcrsamplescollectedicmrapplication: String,
    @ColumnInfo
    val totalsamplestested: String,
    @ColumnInfo
    val totalsessionsconducted: String,
    @ColumnInfo
    val totalvaccineconsumptionincludingwastage: String,
    @ColumnInfo
    val updatetimestamp: String,
    @ColumnInfo
    val years1stdose: String,
    @ColumnInfo
    val years2nddose: String

)