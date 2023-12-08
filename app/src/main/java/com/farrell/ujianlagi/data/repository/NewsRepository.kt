import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.farrell.ujianlagi.data.model.NewsResponse
import com.farrell.ujianlagi.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
class NewsRepository {
//    CNN
    private val _CnnEntertaimentNews = MutableLiveData<NewsResponse>()
    val CnnEntertaimentNews: LiveData<NewsResponse> = _CnnEntertaimentNews

    private val _CnnTerbaruNews = MutableLiveData<NewsResponse>()
    val CnnTerbaruNews: LiveData<NewsResponse> = _CnnTerbaruNews

    private val _CnnEcoNews = MutableLiveData<NewsResponse>()
    val CnnEcoNews: LiveData<NewsResponse> = _CnnEcoNews


    //    CNBC
    private val _CnbcTechNews = MutableLiveData<NewsResponse>()
    val CnbcTechNews: LiveData<NewsResponse> = _CnbcTechNews

    private val _CnbcMarketNews = MutableLiveData<NewsResponse>()
    val CnbcMarketNews: LiveData<NewsResponse> = _CnbcMarketNews

    private val _CnbcLifestyleNews = MutableLiveData<NewsResponse>()
    val CnbcLifeStyleNews: LiveData<NewsResponse> = _CnbcLifestyleNews


//    Republika
    private val _RepublikaInternasionalNews = MutableLiveData<NewsResponse>()
    val RepublikaInternasionalNews: LiveData<NewsResponse> = _RepublikaInternasionalNews

    private val _RepublikaIslamNews = MutableLiveData<NewsResponse>()
    val RepublikaIslamNews: LiveData<NewsResponse> = _RepublikaIslamNews

    private val _RepublikaKhazanahNews = MutableLiveData<NewsResponse>()
    val RepublikaKhazanahNews: LiveData<NewsResponse> = _RepublikaKhazanahNews

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    fun getCnnEntertaimentNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnnEntertainmentNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnnEntertaimentNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnnTerbaruNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnnTerbaruNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnnTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }
    fun getCnnEcoNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnnEcoNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnnEcoNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

//    Cnbc
    fun getCnbcTechNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnbcTechNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnbcTechNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcMarketNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnbcMarketNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnbcMarketNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getCnbcLifeStyleNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getCnbcLifestyleNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _CnbcLifestyleNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }






    fun getRepublikaInternasionalNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getRepublikaInternasionalNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _RepublikaInternasionalNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getRepublikaIslamlNews() {
        _isLoading.value = true

        ApiClient.provideApiService().getRepublikaIslamlNews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _RepublikaIslamNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }

    fun getRepublikaKhazanahNewsews() {
        _isLoading.value = true

        ApiClient.provideApiService().getRepublikaKhazanahNewsews()
            .enqueue(object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if (response.isSuccessful) {
                        val responseBody = response.body()
                        if (responseBody != null) {
                            _RepublikaKhazanahNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }

            })
    }
}


