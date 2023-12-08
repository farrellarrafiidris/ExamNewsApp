package com.farrell.ujianlagi.ui.detail

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.farrell.ujianlagi.R
import com.farrell.ujianlagi.data.model.Data
import com.farrell.ujianlagi.data.model.PostsItem
import com.farrell.ujianlagi.databinding.ActivityDetailNewsBinding
import com.squareup.picasso.Picasso

class DetailNewsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailNewsBinding

    companion object {
        const val DATA_NEWS = "data_news"
        const val DATE_NEWS = "date_news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarDetail)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Detail News"
        }

        val dataNews = intent.getParcelableExtra<PostsItem>(DATA_NEWS)
        val dataDate = intent.getStringExtra(DATE_NEWS)

        setupMyXml(dataNews, dataDate)
        setupWebView(dataNews)
    }


    private fun setupWebView(dataNews: PostsItem?) {
        val webSetting = binding.wvDetail.settings
        webSetting.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        binding.wvDetail.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                binding.loadingView.root.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                binding.loadingView.root.visibility = View.GONE
            }
        }
        dataNews?.link?.let { binding.wvDetail.loadUrl(it) }
    }

    private fun setupMyXml(dataNews: PostsItem?, dataDate: String?) {
        binding.apply {
            detailTitle.text = dataNews?.title
            detailPublishedAt.text = dataDate

            Picasso.get()
                .load(dataNews?.thumbnail)
                .fit()
                .centerInside()
                .into(detailImage)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}