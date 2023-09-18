package com.nermingules.kampguniki.util

import android.content.Context
import android.widget.Toast

fun String.mesajOlarakGoster(context: Context)
{
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}