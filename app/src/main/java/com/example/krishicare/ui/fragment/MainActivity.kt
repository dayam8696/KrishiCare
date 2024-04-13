package com.example.krishicare.ui.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.KrishiCare.Repository.WeatherRepository
import com.example.KrishiCare.ViewModel.WeatherViewModel
import com.example.KrishiCare.ViewModel.WeatherViewModelProviderFactory
import com.example.krishicare.R
import com.example.krishicare.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var viewmodel : WeatherViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val weatherRepository = WeatherRepository()
        val viewModelProviderFactory = WeatherViewModelProviderFactory(weatherRepository)
        viewmodel = ViewModelProvider(this,viewModelProviderFactory).get(WeatherViewModel::class.java)
        val bottomNav = binding.bottomNav
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.NavHost) as NavHostFragment
        val navController = navHostFragment.navController
        bottomNav.setupWithNavController(navController)
    }}

