package com.example.wetherappcourse.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wetherappcourse.R
import com.example.wetherappcourse.adapters.WeatherModel
import com.example.wetherappcourse.adapters.WetherAdapter
import com.example.wetherappcourse.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WetherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()

    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WetherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel("", "12:00", "sunny", "25", "", "","", ""),
            WeatherModel("", "13:00", "sunny", "27", "", "","", ""),
            WeatherModel("", "12:00", "sunny", "35", "", "","", "")
        )
        adapter.submitList(list)
    }


    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}