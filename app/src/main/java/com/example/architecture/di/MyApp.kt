package com.example.architecture.di

import androidx.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : MultiDexApplication()