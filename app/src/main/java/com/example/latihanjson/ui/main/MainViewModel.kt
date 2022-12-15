package com.example.latihanjson.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.latihanjson.data.model.ResponseDataNews
import com.example.latihanjson.data.remote.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    val resultNews = MutableLiveData<ResponseDataNews>()

    fun fetchNews() {
        viewModelScope.launch(Dispatchers.IO)
        {
            val response = ApiClient
                .services
                .getNews()
            Log.e("response", response.toString())
        }


    }
}