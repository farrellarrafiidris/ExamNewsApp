package com.farrell.ujianlagi.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.farrell.ujianlagi.ui.home.MerdekaNewsFragment
import com.farrell.ujianlagi.ui.MerdekaNews.BudayaNewsFragment
import com.farrell.ujianlagi.ui.MerdekaNews.EkonomiNewsFragment
import com.farrell.ujianlagi.ui.MerdekaNews.PolitikNewsFragment


class MerdekaPagerAdapter(fa: MerdekaNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> BudayaNewsFragment()
            1 -> EkonomiNewsFragment()
            2 -> PolitikNewsFragment()
            else -> BudayaNewsFragment()
        }
    }

}
