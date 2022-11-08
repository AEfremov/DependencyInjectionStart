package ru.efremov.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import ru.efremov.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import ru.efremov.dependencyinjectionstart.example2.domain.ExampleRepository

@Module
interface DomainModule {

    @Binds
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository
}