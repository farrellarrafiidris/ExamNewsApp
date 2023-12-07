package com.farrell.ujianlagi.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farrell.ujianlagi.R
import com.farrell.ujianlagi.adapter.CnnPagerAdapter
import com.farrell.ujianlagi.adapter.MerdekaPagerAdapter
import com.farrell.ujianlagi.databinding.FragmentCnnNewsBinding
import com.farrell.ujianlagi.databinding.FragmentMerdekaNewsBinding
import com.google.android.material.tabs.TabLayoutMediator

class MerdekaNewsFragment : Fragment() {
    lateinit var binding: FragmentMerdekaNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMerdekaNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.vpNews.adapter = MerdekaPagerAdapter(this)

        val tabsList = arrayOf(
            "Budaya",
            "Ekonomi",
            "Politik"
        )
        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
            tab.text = tabsList[page]
        }.attach()
    }
}