package com.nermingules.kampguniki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.nermingules.kampguniki.R
import com.nermingules.kampguniki.data.BtkDatabase
import com.nermingules.kampguniki.data.Ogrenci
import com.nermingules.kampguniki.databinding.ActivityGlideBinding
import com.nermingules.kampguniki.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    var binding: ActivityWebViewBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUI()
        veriGetir()


    }

    fun veriGetir() {
        val veritabani = BtkDatabase.getBtkDatabase(applicationContext)
        val ekleyecegimOgrenci = Ogrenci(
            adi = "Mehmet",
            soyadi = "Öz"
        )

        val ekleyecegimOgrenci2 = Ogrenci(
            adi = "Çiğdem",
            soyadi = "Özoglu"
        )
        veritabani.ogrenciDAO().insert(ekleyecegimOgrenci)
        veritabani.ogrenciDAO().insert(ekleyecegimOgrenci2)
        var ogrenciListesi: ArrayList<Ogrenci> =
            veritabani.ogrenciDAO().tumOgrenciler() as ArrayList<Ogrenci>
        ogrenciListesi.forEach {
            Log.e("Ogrencim", "Ogrenci" + it.toString())
        }
    }

    fun initUI() {
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)
        binding?.webView?.apply {
            settings.javaScriptEnabled = true
            binding?.webView?.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(
                    view: WebView,
                    request: WebResourceRequest
                ): Boolean {
                    return super.shouldOverrideUrlLoading(view, request)
                }
            }
            val htmlData = "<b>Koyu</b> and <i>İtalik</i> yazı</p>"
            //  loadUrl("https://www.btkakademi.gov.tr/portal/")
            var strResource = resources.getString(R.string.benim_html_metnim)
            loadData(strResource, "text/html; charset=UTF-8", null)

        }


    }

    override fun onBackPressed() {
        binding?.webView?.apply {
            if (canGoBack()) {
                goBack()
            } else {
                super.onBackPressed()
            }
        }
    }
}
