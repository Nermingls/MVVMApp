package com.nermingules.kampguniki.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.nermingules.kampguniki.MessageUtils
import com.nermingules.kampguniki.R
import com.nermingules.kampguniki.util.HangiDil
import com.nermingules.kampguniki.util.LanguageManager
import com.nermingules.kampguniki.util.mesajBas

class DilActivity : AppCompatActivity() {
    @SuppressLint("MissiningInflated")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dil)
        initUI()
    }

    fun initUI() {
        initButtons()
    }

    fun initButtons() {
        val buttonTr: Button = findViewById(R.id.btnTr)
        val buttonEn: Button = findViewById(R.id.btnEn)
        buttonTr.setOnClickListener {
            LanguageManager.dilDegistir(HangiDil.TURKCE,this)
            mesajBas("Dil Türkçe Oldu")
        }
        buttonEn.setOnClickListener {
            LanguageManager.dilDegistir(HangiDil.ENGLISH,this)
           MessageUtils.mesajBas("Dil İngilizce Oldu",applicationContext)
        }
    }






}