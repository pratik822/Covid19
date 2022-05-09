package com.example.covid19.di

import android.content.Context
import androidx.room.Room
import com.example.covid19.Networking.db.AppDatabase
import com.example.covid19.Networking.db.CovidDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object dbModule {
@Provides
 fun provideAppDatabase(appDatabase: AppDatabase):CovidDao{
     return appDatabase.covidDao();
 }
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context):AppDatabase{
        return Room.databaseBuilder(appContext,AppDatabase::class.java,"coviddb").build();
    }
}