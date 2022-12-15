package com.example.architecture.model

import javax.inject.Inject
import kotlin.random.Random

class Generator @Inject constructor() {

    fun getNextNumber(): Int {
        return Random.nextInt(0, 10)
    }
}