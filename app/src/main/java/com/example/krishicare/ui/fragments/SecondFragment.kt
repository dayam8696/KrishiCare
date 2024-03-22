package com.example.KrishiCare.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.R
import com.example.krishicare.databinding.SecondFragmentBinding
import com.example.krishicare.ui.fragments.BaseFragment

class SecondFragment: BaseFragment() {
    lateinit var state: String
    private val binding by lazy { SecondFragmentBinding.inflate(layoutInflater)}
    private val outputIndexes = arrayListOf(
        "apple",
        "banana",
        "blackgram",
        "chickpea",
        "coconut",
        "coffee",
        "cotton",
        "grapes",
        "jute",
        "kidneybeans",
        "lentil",
        "maize",
        "mango",
        "mothbeans",
        "mungbean",
        "muskmelon",
        "orange",
        "papaya",
        "pigeonpeas",
        "pomegranate",
        "rice",
        "watermelon "
    )

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

    private fun prepareStatesSpinner() {
        val indianStates = arrayListOf<String>("Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh","Delhi" , "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal")
        val adapter =
            ArrayAdapter(
                requireContext(),
                R.layout.support_simple_spinner_dropdown_item,
                indianStates
            )

        binding.spinnerIndianState.adapter = adapter

        binding.spinnerIndianState.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    adapterView: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                    state = indianStates[position]

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }

            }
}
    }