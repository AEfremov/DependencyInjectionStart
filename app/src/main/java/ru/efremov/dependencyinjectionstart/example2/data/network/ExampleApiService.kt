package ru.efremov.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import ru.efremov.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService: ${context.getString(R.string.app_name)} $timeMillis")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}