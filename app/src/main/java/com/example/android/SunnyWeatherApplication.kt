package com.example.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {

    companion object {
        @SuppressWarnings("StaticFieldLeak")
        const val TOKEN = "Vc2g622Kg6IcwB9A"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}