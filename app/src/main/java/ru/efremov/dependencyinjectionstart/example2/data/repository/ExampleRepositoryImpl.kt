package ru.efremov.dependencyinjectionstart.example2.data.repository

import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.efremov.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.efremov.dependencyinjectionstart.example2.data.mapper.ExampleMapper
import ru.efremov.dependencyinjectionstart.example2.di.ProdQualifier
import ru.efremov.dependencyinjectionstart.example2.di.TestQualifier
import ru.efremov.dependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}