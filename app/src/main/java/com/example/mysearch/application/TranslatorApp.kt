package com.example.mysearch.application

import android.app.Application
import com.example.mysearch.di.application
import com.example.mysearch.di.mainScreen
import org.koin.core.context.startKoin

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(application, mainScreen))
        }
    }
}