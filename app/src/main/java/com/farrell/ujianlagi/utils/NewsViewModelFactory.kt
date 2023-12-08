package com.farrell.ujianlagi.utils

import NewsRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.farrell.ujianlagi.ui.NewsViewModel

class NewsViewModelFactory(private val repository: NewsRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NewsViewModel::class.java)) {
            return NewsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}