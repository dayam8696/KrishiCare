package com.example.KrishiCare.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.KrishiCare.ViewModel.WeatherViewModel
import com.example.KrishiCare.utils.Resource
import com.example.krishicare.databinding.WeatherFragmentBinding
import com.example.krishicare.ui.activites.MainActivity
import com.example.krishicare.ui.fragments.BaseFragment

class WeatherFragment : BaseFragment() {
    private val binding by lazy { WeatherFragmentBinding.inflate(layoutInflater) }
    lateinit var viewModel: WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewmodel

        viewModel.getCurrentWeather()

        viewModel.currentWeatheer.observe(viewLifecycleOwner) { response ->
            when (response) {
                is Resource.Success -> {
                    response.data?.let { weatherResponse ->
                        binding.apply {
                            tvTemp.text = "${weatherResponse.main.temp.toInt().toString()}°C"
                            tvMaxTemp.text = "Max temp:${weatherResponse.main.temp_max.toInt().toString()}°C"
                            tvMinTemp.text = "Min temp${weatherResponse.main.temp_min.toInt().toString()}°C"

                        }


                        Log.d("DYM", weatherResponse.toString())
                    }
                }

                is Resource.Error -> {

                    response.message?.let { message ->
                        Log.d("DYM", message)
                    }

                }

                is Resource.Loading -> {

                }
            }
        }

    }
}