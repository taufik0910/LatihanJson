package com.example.latihanjson.data.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("alamat")
    val alamat: String,
    @SerializedName("gaji")
    val gaji: List<Int>,
    @SerializedName("nama")
    val nama: String,
    @SerializedName("pekerjaan")
    val pekerjaan: String,
    @SerializedName("umur")
    val umur: Int
)