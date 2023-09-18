package com.nermingules.kampguniki.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nermingules.kampguniki.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RetrofitActivity : AppCompatActivity() {
    //val service = PlaceHolderService.build()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_holder_service)
        getAlbums()
    }

    /* fun getUsers(){
         GlobalScope.launch {
             var liste = service.getAllUsers()

         }
     }*/
    fun getAlbums() {
        GlobalScope.launch {


        }
    }
}