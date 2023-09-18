package com.nermingules.kampguniki.util

import android.content.Context
import android.widget.Toast

fun Context.mesajBas(mesaj : String)
{
    Toast.makeText(this, mesaj, Toast.LENGTH_SHORT).show()
}