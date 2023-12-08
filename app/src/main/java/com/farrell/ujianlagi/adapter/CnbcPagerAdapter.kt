package com.farrell.ujianlagi.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.farrell.ujianlagi.ui.home.CnbcNewsFragment
import com.farrell.ujianlagi.ui.CnbcNews.MarketNewsFragment
import com.farrell.ujianlagi.ui.CnbcNews.TechNewsFragment
import com.farrell.ujianlagi.ui.CnbcNews.LifestyleNewsFragment

class CnbcPagerAdapter(fa: CnbcNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MarketNewsFragment()
            1 -> TechNewsFragment()
            2 -> LifestyleNewsFragment()
            else -> MarketNewsFragment()
        }
    }

}
