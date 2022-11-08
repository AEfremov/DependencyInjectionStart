package ru.efremov.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}