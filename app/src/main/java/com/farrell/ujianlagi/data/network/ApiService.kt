package com.farrell.ujianlagi.data.network

import com.farrell.ujianlagi.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    //CNN
    @GET("/cnn/terbaru")
    fun getCnnTerbaruNews(
    ) : Call<NewsResponse>

    @GET("/cnn/hiburan")
    fun getCnnEntertainmentNews(
    ) : Call<NewsResponse>

    @GET("/cnn/ekonomi")
    fun getCnnEcoNews(
    ) : Call<NewsResponse>






//  CNBC
    @GET("/cnbc/market")
    fun getCnbcMarketNews(
    ) : Call<NewsResponse>

    @GET("/cnbc/tech")
    fun getCnbcTechNews(
    ) : Call<NewsResponse>

    @GET("/cnbc/lifestyle")
    fun getCnbcLifestyleNews(
    ) : Call<NewsResponse>




    @GET("/republika/internasional/")
    fun getRepublikaInternasionalNews(
    ) : Call<NewsResponse>

    @GET("/republika/islam/")
    fun getRepublikaIslamlNews(
    ) : Call<NewsResponse>

    @GET("/republika/khazanah/")
    fun getRepublikaKhazanahNewsews(
    ) : Call<NewsResponse>
}