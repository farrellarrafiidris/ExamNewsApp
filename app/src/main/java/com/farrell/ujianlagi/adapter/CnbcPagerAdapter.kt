package com.farrell.ujianlagi.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.farrell.ujianlagi.ui.home.CnbcNewsFragment
import com.farrell.ujianlagi.ui.CnbcNews.LocalNewsFragment
import com.farrell.ujianlagi.ui.CnbcNews.NasionalNewsFragment
import com.farrell.ujianlagi.ui.CnbcNews.TeknologiNewsFragment

class CnbcPagerAdapter(fa: CnbcNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> LocalNewsFragment()
            1 -> NasionalNewsFragment()
            2 -> TeknologiNewsFragment()
            else -> LocalNewsFragment()
        }
    }

}
