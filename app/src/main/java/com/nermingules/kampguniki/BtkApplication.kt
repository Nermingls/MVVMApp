package com.nermingules.kampguniki

import android.app.Application

class BtkApplication : Application() {

    var instance: BtkApplication? = null

    fun getApp(): BtkApplication {
        if (instance== null) {
            instance = this
        }
        return instance!!
    }
}
