package com.example.latihanjson.data.remote

import com.example.latihanjson.data.model.Article
import retrofit2.http.GET

interface ApiServices {
    @GET("/v2/top-headlines?country=us&apiKey=2f411b21be4e4de8ad57d91a07e0b791")
    suspend fun getNews(): Article
}