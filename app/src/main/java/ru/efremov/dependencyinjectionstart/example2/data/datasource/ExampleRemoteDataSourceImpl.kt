package ru.efremov.dependencyinjectionstart.example2.data.datasource

import ru.efremov.dependencyinjectionstart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}