package com.example.covid19.di

import com.example.covid19.Networking.Retrofit_Service
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    @Provides
    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://data.covid19india.org/")
    }
    @Provides
    fun provideApiServices(retrofit:Retrofit.Builder):Retrofit_Service{
        return retrofit.build().create(Retrofit_Service::class.java)
    }
}