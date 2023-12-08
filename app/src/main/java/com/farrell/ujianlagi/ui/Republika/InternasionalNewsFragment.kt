package com.farrell.ujianlagi.ui.Republika

import NewsRepository
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.farrell.ujianlagi.adapter.NewsAdapter
import com.farrell.ujianlagi.databinding.FragmentInternasionalNewsBinding
import com.farrell.ujianlagi.ui.NewsViewModel
import com.farrell.ujianlagi.utils.NewsViewModelFactory


class InternasionalNewsFragment : Fragment() {

    private lateinit var binding: FragmentInternasionalNewsBinding
    private val commonViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInternasionalNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        commonViewModel.getRepublikaInternasionalNews()
        commonViewModel.RepublikaInternasionalNews.observe(viewLifecycleOwner) { newsResponse ->
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