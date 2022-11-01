package ru.efremov.dependencyinjectionstart.example2.presentation

import ru.efremov.dependencyinjectionstart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}