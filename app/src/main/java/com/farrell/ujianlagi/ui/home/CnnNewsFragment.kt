package com.farrell.ujianlagi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.farrell.ujianlagi.adapter.CnnPagerAdapter
import com.farrell.ujianlagi.databinding.FragmentCnnNewsBinding
import com.google.android.material.tabs.TabLayoutMediator

class CnnNewsFragment : Fragment() {
    lateinit var binding: FragmentCnnNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCnnNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.vpNews.adapter = CnnPagerAdapter(this)

        val tabsList = arrayOf(
            "Terbaru",
            "Ekonomi",
            "Hiburan"
        )
        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
            tab.text = tabsList[page]
        }.attach()
    }
}