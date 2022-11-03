package com.example.webview_test

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {
    private var doubleBackToExitPressedOnce = false
    private lateinit var webView: WebView
    private lateinit var webViewLayout: FrameLayout

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webview)
        webViewLayout = findViewById(R.id.webview_frame);

        webView.settings.run {
            javaScriptEnabled = true
            domStorageEnabled = true
//            javaScriptCanOpenWindowsAutomatically = true
            setSupportMultipleWindows(true)
        }
        webView.loadUrl("http://192.168.20.212:3000/login?type=ibk&key=A1423456&hc=212000001")
    }
}