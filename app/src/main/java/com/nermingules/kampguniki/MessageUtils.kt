package com.nermingules.kampguniki

import android.content.Context
import android.widget.Toast

object MessageUtils {
    fun mesajBas(mesaj: String,context : Context) {
        Toast.makeText(context, mesaj, Toast.LENGTH_LONG).show()
    }
}