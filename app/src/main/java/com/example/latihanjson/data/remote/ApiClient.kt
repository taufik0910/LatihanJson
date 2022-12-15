package com.example.latihanjson.data.remote

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {
    private val okHttpClient = OkHttpClient.Builder()
        .readTimeout(25,TimeUnit.SECONDS)
        .connectTimeout(60,TimeUnit.SECONDS)
        .writeTimeout(300,TimeUnit.SECONDS)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val services = retrofit.create(ApiServices::class.java)
}