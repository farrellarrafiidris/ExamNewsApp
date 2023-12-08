package com.farrell.ujianlagi.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farrell.ujianlagi.adapter.RepublikaPagerAdapter
import com.farrell.ujianlagi.databinding.FragmentRepublikaNewsBinding
import com.google.android.material.tabs.TabLayoutMediator

class RepublikaNewsFragment : Fragment() {
    lateinit var binding: FragmentRepublikaNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRepublikaNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpViewPager()
    }

    private fun setUpViewPager() {
        binding.vpNews.adapter = RepublikaPagerAdapter(this)

        val tabsList = arrayOf(
            "Internasional",
            "Islam",
            "Khazanah"
        )
        TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
            tab.text = tabsList[page]
        }.attach()
    }
}