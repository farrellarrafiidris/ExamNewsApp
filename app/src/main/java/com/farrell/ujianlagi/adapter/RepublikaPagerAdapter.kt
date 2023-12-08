package com.farrell.ujianlagi.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.farrell.ujianlagi.ui.home.RepublikaNewsFragment
import com.farrell.ujianlagi.ui.Republika.InternasionalNewsFragment
import com.farrell.ujianlagi.ui.Republika.IslamNewsFragment
import com.farrell.ujianlagi.ui.Republika.KhazanahNewsFragment


class RepublikaPagerAdapter(fa: RepublikaNewsFragment) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> InternasionalNewsFragment()
            1 -> IslamNewsFragment()
            2 -> KhazanahNewsFragment()
            else -> InternasionalNewsFragment()
        }
    }

}
