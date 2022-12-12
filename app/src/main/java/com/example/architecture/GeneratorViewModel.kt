package com.example.architecture


import androidx.lifecycle.ViewModel
import com.example.architecture.mvcorwhatever.GeneratorModel
import com.example.architecture.mvcorwhatever.GeneratorViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GeneratorViewModel @Inject constructor(
    private val model: GeneratorModel,
    private val viewState: GeneratorViewState
) : ViewModel(),
    GeneratorViewState by viewState,
    GeneratorModel by model