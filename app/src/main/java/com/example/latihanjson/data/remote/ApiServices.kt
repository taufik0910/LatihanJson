package com.example.latihanjson.data.remote

import com.example.latihanjson.data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ApiServices {
    @GET("/v2/top-headlines?country=us&apiKey=2f411b21be4e4de8ad57d91a07e0b791")
    suspend fun getNews(): NewsResponse
}