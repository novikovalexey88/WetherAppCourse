package com.example.wetherappcourse

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wetherappcourse.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}