package ru.efremov.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}