package ru.efremov.dependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import ru.efremov.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)}")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}