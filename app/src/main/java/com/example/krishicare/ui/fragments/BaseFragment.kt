package com.example.krishicare.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.krishicare.databinding.BaseFragmentsBinding

open class BaseFragment :Fragment() {
    private val binding by lazy { BaseFragmentsBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}