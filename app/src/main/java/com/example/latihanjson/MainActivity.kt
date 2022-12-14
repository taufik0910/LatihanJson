package com.example.latihanjson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.latihanjson.databinding.ActivityMainBinding
import com.example.latihanjson.model.User
import com.google.gson.Gson
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fileString: String =
            applicationContext.assets.open("data.json").bufferedReader().use { it.readText() }

            val user = Gson().fromJson(fileString, User::class.java)
            Log.e("User", user.toString())


    }
}