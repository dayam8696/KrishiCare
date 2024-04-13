package com.example.krishicare.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.krishicare.R
import com.example.krishicare.databinding.HomeFragmentBinding
import com.example.krishicare.ui.activites.BaseFragments

class HomeFragment : BaseFragments() {
    private val binding by lazy { HomeFragmentBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            ClickLisner()
    }

    fun ClickLisner() {

        binding.btnpredict.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }
        binding.btndisease.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_diseaseDetectionFragment)
        }
        binding.btnfertilizer.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fertilizerFragment2)
        }

    }
}