package com.example.architecture


import androidx.lifecycle.ViewModel
import com.example.architecture.mvcorwhatever.GeneratorController
import com.example.architecture.mvcorwhatever.GeneratorViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GeneratorViewModel @Inject constructor(
    private val controller: GeneratorController,
    private val viewState: GeneratorViewState
) : ViewModel(),
    GeneratorViewState by viewState,
    GeneratorController by controller