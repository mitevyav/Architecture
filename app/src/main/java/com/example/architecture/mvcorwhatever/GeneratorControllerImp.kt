package com.example.architecture.mvcorwhatever

import com.example.architecture.model.Generator
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import kotlin.random.Random

@ViewModelScoped
class GeneratorControllerImp @Inject constructor(
    private val view: GeneratorView,
    private val model: Generator
) : GeneratorController {


    override fun generateNewNumber() {
        val number = model.getNextNumber()
        if (number > 2) {
            view.nextNumber(number)
        } else {
            view.showError()
        }
    }
}