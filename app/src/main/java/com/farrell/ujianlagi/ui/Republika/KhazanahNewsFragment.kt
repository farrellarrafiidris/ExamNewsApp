package com.farrell.ujianlagi.ui.Republika

import NewsRepository
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.ujianlagi.adapter.NewsAdapter
import com.farrell.ujianlagi.databinding.FragmentIslamNewsBinding
import com.farrell.ujianlagi.databinding.FragmentKhazanahNewsBinding
import com.farrell.ujianlagi.ui.NewsViewModel
import com.farrell.ujianlagi.utils.NewsViewModelFactory

class KhazanahNewsFragment : Fragment() {

    private lateinit var binding: FragmentKhazanahNewsBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKhazanahNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getRepublikaKhazanahNews()
        commonViewModel.RepublikaKhazanahNews.observe(viewLifecycleOwner) { newsResponse ->
            val articles = newsResponse.data?.posts
            articles?.let {
                mAdapter.setData(it.filterNotNull())
                binding.rvNews.apply {
                    adapter = mAdapter
                    layoutManager = LinearLayoutManager(requireContext())
                }
            }
        }
    }

}