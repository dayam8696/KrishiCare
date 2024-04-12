package com.example.krishicare.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.krishicare.databinding.HomeFragmentBinding

class HomeFragment : BaseFragments(){
    private val binding by lazy {HomeFragmentBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    fun ClickLisner(){

    }
}