package com.nermingules.kampguniki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nermingules.kampguniki.R
import com.nermingules.kampguniki.databinding.ActivityStilBinding
import com.nermingules.kampguniki.util.mesajBas

class StyleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityStilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var adi:String?=null
        adi?.let {

        }
        binding.apply {
            buttonMavi.setOnClickListener(){
                mesajBas("Merhaba")
            }
        }
    }
}