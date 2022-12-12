package com.example.architecture.mvcorwhatever

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import kotlin.random.Random

@ViewModelScoped
class Generator @Inject constructor(private val view: GeneratorView) : GeneratorModel {


    override fun generateNewNumber() {
        val number = getNextNumber()
        if (number > 2) {
            view.nextNumber(number)
        } else {
            view.showError()
        }
    }

    private fun getNextNumber(): Int {
        return Random.nextInt(0, 10)
    }
}