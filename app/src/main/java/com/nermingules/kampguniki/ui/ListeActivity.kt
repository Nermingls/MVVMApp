package com.nermingules.kampguniki.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nermingules.kampguniki.data.PalaceHolderApi
import com.nermingules.kampguniki.data.PlaceHolderService
import com.nermingules.kampguniki.databinding.ActivityListeBinding
import com.nermingules.kampguniki.util.mesajBas
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ListeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initUI()
        getAlbums()
    }

  /*  val service = PlaceHolderService.build()
    fun getUsers() {
        GlobalScope.launch {
            var liste = service.getAllUsers()
            runOnUiThread{
                initRecyclerView2(liste.body() as ArrayList<UserModelItem>)
            }


        }
    }*/
  val service =PlaceHolderService.build()
    fun getAlbums() {
        GlobalScope.launch {
            var liste = service.getAllAlbums()
            runOnUiThread{
                initRecyclerView3(liste.body() as ArrayList<AlbumModelItem>)
            }
        }
    }

    fun initUI() {
        binding = ActivityListeBinding.inflate(layoutInflater)
        setContentView(binding.root)
       // initRecyclerView()
        binding.apply {
            btnEkle.setOnClickListener {
                ogrenciler.add(editText.text.toString())
                ogrenciAdapter.notifyDataSetChanged()
            }
        }
    }

    var ogrenciler = arrayListOf<String>(
        "Muhammet ÇAĞATAY",
        "Nisa Çağatay",
        "Zekican Zekeriaoğlu"
    )

    private lateinit var ogrenciAdapter: OgrenciAdapter
    private lateinit var userAdapter: UserAdapter
    private lateinit var albumsAdapter: AlbumsAdapter

    fun initRecyclerView3(albumler: ArrayList<AlbumModelItem>) {
        binding.apply {
            albumsAdapter = AlbumsAdapter(
                albumler = albumler,
                onClik = { pozisyon ->
                    mesajBas(albumler[pozisyon].title)
                },
                onDelete = { index ->
                    albumler.removeAt(index)
                    userAdapter.notifyDataSetChanged()
                }
            )
            rcvOgrenci.apply {
                adapter = albumsAdapter
                layoutManager = LinearLayoutManager(applicationContext)
                //layoutManager = GridLayoutManager(applicationContext,2)
            }
        }
    }

    fun initRecyclerView2(kullanicilar: ArrayList<UserModelItem>) {
        binding.apply {
            userAdapter = UserAdapter(
                kullanicilar = kullanicilar,
                onClik = { pozisyon ->
                    mesajBas(kullanicilar[pozisyon].email+""+kullanicilar[pozisyon].name)
                },
                onDelete = { index ->
                    kullanicilar.removeAt(index)
                    userAdapter.notifyDataSetChanged()
                }
            )
            rcvOgrenci.apply {
                adapter = userAdapter
                layoutManager = LinearLayoutManager(applicationContext)
                //layoutManager = GridLayoutManager(applicationContext,2)
            }
        }
    }

    fun initRecyclerView() {
        binding.apply {
            ogrenciAdapter = OgrenciAdapter(
                ogrenciler = ogrenciler,
                onClik = { pozisyon ->
                    mesajBas(ogrenciler[pozisyon])
                },
                onDelete = { index ->
                    ogrenciler.removeAt(index)
                    ogrenciAdapter.notifyDataSetChanged()
                }
            )
            rcvOgrenci.apply {
                adapter = ogrenciAdapter
                layoutManager = LinearLayoutManager(applicationContext)
                //layoutManager = GridLayoutManager(applicationContext, 2)
            }
        }
    }
}