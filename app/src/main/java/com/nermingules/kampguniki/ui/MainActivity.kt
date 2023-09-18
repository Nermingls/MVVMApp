package com.nermingules.kampguniki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nermingules.kampguniki.R
import com.nermingules.kampguniki.data.BtkDatabase
import com.nermingules.kampguniki.data.Ogrenci

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("BTK_LOG","onCreate yapıldı")
    }
    override fun onStart() {
        Log.e("BTK_LOG","onStart yapıldı")
        super.onStart()
    }

    override fun onResume() {
        Log.e("BTK_LOG","onResume yapıldı")
        super.onResume()
    }

    override fun onRestart() {
        Log.e("BTK_LOG","onRestart yapıldı")
        super.onRestart()
    }

    override fun onPause() {
        Log.e("BTK_LOG","onPause yapıldı")
        super.onPause()
    }

    override fun onStop() {
        Log.e("BTK_LOG","onStop yapıldı")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("BTK_LOG","onDestroy yapıldı")
        super.onDestroy()
    }

    //todo yeni sprintte burası değişecek

  }