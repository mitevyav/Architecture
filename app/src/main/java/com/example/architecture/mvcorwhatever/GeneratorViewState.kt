package com.example.architecture.mvcorwhatever

import androidx.lifecycle.LiveData
import com.example.architecture.Event

interface GeneratorViewState {

    val nextNumber: LiveData<Int>

    val showError: LiveData<Event<Unit>>
}