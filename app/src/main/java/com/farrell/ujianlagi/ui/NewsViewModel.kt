package com.farrell.ujianlagi.ui

import NewsRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.farrell.ujianlagi.data.model.NewsResponse

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {
    val CnnEntertaimentNews: LiveData<NewsResponse> = repository.CnnEntertaimentNews
    val CnnTerbaruNews: LiveData<NewsResponse> = repository.CnnTerbaruNews
    val CnnEcoNews: LiveData<NewsResponse> = repository.CnnEcoNews
    val CnbcMarketNews: LiveData<NewsResponse> = repository.CnbcMarketNews
    val CnbcTechNews: LiveData<NewsResponse> = repository.CnbcTechNews
    val CnbcLifestyleNews: LiveData<NewsResponse> = repository.CnbcLifeStyleNews
    val RepublikaInternasionalNews: LiveData<NewsResponse> = repository.RepublikaInternasionalNews
    val RepublikaIslamNews: LiveData<NewsResponse> = repository.RepublikaIslamNews
    val RepublikaKhazanahNews: LiveData<NewsResponse> = repository.RepublikaKhazanahNews
    val isLoading: LiveData<Boolean> = repository.isLoading

    fun getCnnEntertaimentNews() {
        repository.getCnnEntertaimentNews()
    }

    fun getCnnTerbaruNews() {
        repository.getCnnTerbaruNews()
    }

    fun getCnnEcoNews() {
        repository.getCnnEcoNews()
    }

    fun getCnbcMarketNews() {
        repository.getCnbcMarketNews()
    }

    fun getCnbcTechNews() {
        repository.getCnbcTechNews()
    }

    fun getCnbcLifestyleNews() {
        repository.getCnbcLifeStyleNews()
    }

    fun getRepublikaInternasionalNews() {
        repository.getRepublikaInternasionalNews()
    }

    fun getRepublikaIslamlNews() {
        repository.getRepublikaIslamlNews()
    }

    fun getRepublikaKhazanahNews() {
        repository.getRepublikaKhazanahNewsews()
    }

}