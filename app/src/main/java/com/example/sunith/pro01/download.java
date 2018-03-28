package com.example.sunith.pro01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by sunith on 18-09-2017.
 */

public class download extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webman);
        WebView bro=(WebView)findViewById(R.id.webbro);
        bro.setWebViewClient(new WebViewClient());
        bro.loadUrl("https://www.google.co.in/");
    }
}
