package com.example.architecture.mvcorwhatever

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.architecture.Event
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ViewAndViewStateImpl @Inject constructor() : GeneratorViewState, GeneratorView {

    private val _nextNumber = MutableLiveData<Int>()
    override val nextNumber: LiveData<Int> = _nextNumber

    private val _showError = MutableLiveData<Event<Unit>>()
    override val showError: LiveData<Event<Unit>> = _showError


    override fun nextNumber(number: Int) {
        _nextNumber.value = number
    }

    override fun showError() {
        _showError.value = Event(Unit)
    }


}