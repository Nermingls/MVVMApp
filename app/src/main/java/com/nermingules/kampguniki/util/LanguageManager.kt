package com.nermingules.kampguniki.util

import android.app.Activity
import java.util.Locale


enum class HangiDil(val deger: String) {
    TURKCE("tr"),
    ENGLISH("en")
}
object LanguageManager {

    fun dilDegistir(hangiDil: HangiDil, activity:Activity)
    {
        val config =activity.resources.configuration
        config.setLocale(Locale(hangiDil.deger))
        activity.resources.updateConfiguration(config,activity.resources.displayMetrics)
        activity.recreate()

    }
}