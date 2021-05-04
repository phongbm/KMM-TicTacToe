package com.phongbm.tictactoe.android

import android.app.Application

/**
 * Create by @{USER} on @{DATE}
 */

class App : Application() {
    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

}