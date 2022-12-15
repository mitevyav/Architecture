package com.example.architecture.di

import com.example.architecture.mvcorwhatever.GeneratorControllerImp
import com.example.architecture.mvcorwhatever.GeneratorController
import com.example.architecture.mvcorwhatever.GeneratorView
import com.example.architecture.mvcorwhatever.GeneratorViewState
import com.example.architecture.mvcorwhatever.ViewAndViewStateImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@InstallIn(ViewModelComponent::class)
@Module
abstract class AppModule {

    @Binds
    @ViewModelScoped
    abstract fun bindView(view: ViewAndViewStateImpl): GeneratorView

    @Binds
    @ViewModelScoped
    abstract fun bindViewState(viewState: ViewAndViewStateImpl): GeneratorViewState

    @Binds
    @ViewModelScoped
    abstract fun bindModel(model: GeneratorControllerImp): GeneratorController
}