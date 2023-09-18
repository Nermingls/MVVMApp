package com.nermingules.kampguniki.data

import com.nermingules.kampguniki.ui.AlbumResponse
import com.nermingules.kampguniki.ui.RetrofitActivity
import com.nermingules.kampguniki.ui.UserResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface PalaceHolderApi{

    @GET("users")
    suspend fun  getAllUsers() : Response<UserResponse>

    @GET("albums")
    suspend fun  getAllAlbums() : Response<AlbumResponse>


}

object PlaceHolderService {
    val baseUrl = "https://jsonplaceholder.typicode.com"
    fun build(): PalaceHolderApi {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHtppClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl)
            .client(okHtppClient)
            .build()
        return retrofit.create(PalaceHolderApi::class.java)
    }
}