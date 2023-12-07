package com.farrell.ujianlagi.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.farrell.ujianlagi.ui.home.CnnNewsFragment
import com.farrell.ujianlagi.ui.CnnNews.InovasiNewsFragment
import com.farrell.ujianlagi.ui.CnnNews.TerbaruNewsFragment
import com.farrell.ujianlagi.ui.CnnNews.TrendingNewsFragment

class CnnPagerAdapter(fa: CnnNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> TerbaruNewsFragment()
            1 -> TrendingNewsFragment()
            2 -> InovasiNewsFragment()
            else -> TerbaruNewsFragment()
        }
    }

}
