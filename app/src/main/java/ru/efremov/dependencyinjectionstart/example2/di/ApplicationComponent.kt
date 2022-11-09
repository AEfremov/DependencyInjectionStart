package ru.efremov.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.efremov.dependencyinjectionstart.example2.data.database.ExampleDatabase
import ru.efremov.dependencyinjectionstart.example2.presentation.ExampleViewModel
import ru.efremov.dependencyinjectionstart.example2.presentation.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [
    DataModule::class,
    DomainModule::class
])
interface ApplicationComponent {

    fun getViewModel(): ExampleViewModel

    fun getDatabase(): ExampleDatabase

    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}