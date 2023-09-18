package com.nermingules.kampguniki.ui
import com.google.gson.annotations.SerializedName


class AlbumResponse : ArrayList<AlbumModelItem>()

data class AlbumModelItem(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
)