package com.example.krishicare.ui.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.KrishiCare.Repository.WeatherRepository
import com.example.KrishiCare.ViewModel.WeatherViewModel
import com.example.KrishiCare.ViewModel.WeatherViewModelProviderFactory
import com.example.krishicare.R

class MainActivity : AppCompatActivity() {
    lateinit var viewmodel : WeatherViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val weatherRepository = WeatherRepository()
        val viewModelProviderFactory = WeatherViewModelProviderFactory(weatherRepository)
        viewmodel = ViewModelProvider(this,viewModelProviderFactory).get(WeatherViewModel::class.java)
    }}