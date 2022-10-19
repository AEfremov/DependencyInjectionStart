package ru.efremov.dependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.efremov.dependencyinjectionstart.R
import ru.efremov.dependencyinjectionstart.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.keyboard.toString()
        activity.monitor.toString()
        activity.mouse.toString()
    }
}