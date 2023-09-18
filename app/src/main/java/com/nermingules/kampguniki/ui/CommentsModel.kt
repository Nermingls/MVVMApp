package com.nermingules.kampguniki.ui
import com.google.gson.annotations.SerializedName


class CommentsModel : ArrayList<CommentsModelItem>()

data class CommentsModelItem(
    @SerializedName("body")
    val body: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("postId")
    val postId: Int
)