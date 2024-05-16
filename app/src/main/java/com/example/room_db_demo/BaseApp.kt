package com.example.room_db_demo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}