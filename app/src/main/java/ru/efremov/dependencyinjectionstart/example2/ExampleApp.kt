package ru.efremov.dependencyinjectionstart.example2

import android.app.Application
import ru.efremov.dependencyinjectionstart.example2.di.DaggerApplicationComponent

class ExampleApp: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}