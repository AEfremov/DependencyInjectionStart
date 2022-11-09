package ru.efremov.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import ru.efremov.dependencyinjectionstart.example2.data.datasource.*

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTEstRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}