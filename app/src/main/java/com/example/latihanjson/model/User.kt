package com.example.latihanjson.model

data class User (val name : String,
                 val umur: Int,
                 val alamat : String,
                 val pekerjaan : String,
                 val gaji : List<Long>)