package ru.efremov.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

//    @Inject
//    lateinit var keyboard: Keyboard

//    private val component = DaggerNewComponent.create()

//    val keyboard: Keyboard = component.getKeyboard()
//    val mouse: Mouse = component.getMouse()
//    val monitor: Monitor = component.getMonitor()

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var monitor: Monitor

    init {
        DaggerNewComponent.create().inject(this)
    }
}