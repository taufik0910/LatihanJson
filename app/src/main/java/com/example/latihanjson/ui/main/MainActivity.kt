package com.example.latihanjson.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.latihanjson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.fetchNews()
        viewModel.resultNews.observe(this){response ->
            binding.tvResult.text = response.toString()
        }


//        val fileString: String =
//            applicationContext.assets.open("data.json").bufferedReader().use { it.readText() }
//
//        val user = Gson().fromJson(fileString, User::class.java)
//        Log.e("User", user.toString())


    }
}