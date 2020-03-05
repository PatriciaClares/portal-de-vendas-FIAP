package com.example.portaisdevenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webVIew.webViewClient = WebViewClient()
        webVIew.settings.javaScriptEnabled = true

        webVIew.loadUrl(intent.getStringExtra("url"))

    }
}
