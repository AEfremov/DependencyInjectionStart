package ru.efremov.dependencyinjectionstart.example1

import dagger.Component

@Component
interface NewComponent {

    fun getKeyboard(): Keyboard

    fun getMouse(): Mouse

    fun getMonitor(): Monitor

    fun inject(activity: Activity)
}