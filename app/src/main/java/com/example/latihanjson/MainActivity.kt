package com.example.latihanjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.latihanjson.databinding.ActivityMainBinding
import com.example.latihanjson.model.User
import org.json.JSONObject
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fileString: String =
            applicationContext.assets.open("data.json").bufferedReader().use { it.readText() }
        Log.e("My Json", fileString)
        val jsonObject = JSONObject(fileString)
        val name = jsonObject.getString("nama")
        val umur = jsonObject.getInt("umur")
        val alamat = jsonObject.getString("alamat")
        val pekerjaan = jsonObject.getString("pekerjaan")
        val gaji = jsonObject.getJSONArray("gaji")

        val listGaji = mutableListOf<Long>()
        for(i in 0  until gaji.length()){
            val myGaji = gaji.getLong(i)
            listGaji.add(myGaji)
        }


        val user = User(name, umur, alamat, pekerjaan,listGaji)
        Log.e("User", user.toString())



    }
}