package ru.efremov.dependencyinjectionstart.example2.presentation

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.efremov.dependencyinjectionstart.R
import ru.efremov.dependencyinjectionstart.example2.ExampleApp
import ru.efremov.dependencyinjectionstart.example2.data.database.ExampleDatabase
import ru.efremov.dependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
    }

    @Inject
    lateinit var viewModel: ExampleViewModel

//    private val component by lazy {
//        DaggerApplicationComponent.factory()
//            .create(application, System.currentTimeMillis())
//    }

    private val database: ExampleDatabase by lazy {
        component.getDatabase()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}