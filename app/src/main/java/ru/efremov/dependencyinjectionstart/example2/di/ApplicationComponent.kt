package ru.efremov.dependencyinjectionstart.example2.di

import dagger.Component
import ru.efremov.dependencyinjectionstart.example2.presentation.MainActivity

@Component(modules = [
    DataModule::class,
    DomainModule::class,
    ContextModule::class
])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}