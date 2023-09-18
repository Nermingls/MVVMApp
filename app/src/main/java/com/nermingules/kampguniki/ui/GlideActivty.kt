package com.nermingules.kampguniki.ui

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nermingules.kampguniki.R
import com.nermingules.kampguniki.databinding.ActivityGlideBinding
import com.nermingules.kampguniki.util.mesajBas

class GlideActivty : AppCompatActivity() {

    var binding : ActivityGlideBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGlideBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        if (internetVarMi()){
            mesajBas("İnternet Var")
        }else{
            mesajBas("İnternet Yok")
        }
        val url ="https://assets-btkakademi-gov-tr.akamaized.net/api/gallery/51/3acb65fe-1dc1-4520-bc24-2f2fba6096bc/kotlin_banner_web-banner%281%29.png"
        Glide.with(applicationContext)
            .load(url)
            .error(R.drawable.drive_iconum)
            .fitCenter()
            .into(binding?.imgGlide!!)
    }

    private fun internetVarMi(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkCapabilities = connectivityManager.activeNetwork ?: return false
        val activeNetwork = connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false
        return activeNetwork.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
    }


}