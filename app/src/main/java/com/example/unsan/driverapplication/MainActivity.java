package com.example.unsan.driverapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wb = (WebView) findViewById(R.id.webView1);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewController());
        wb.getSettings().setDomStorageEnabled(true);
        wb.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        // wb.loadUrl("http://13.251.164.198:9191/");
        wb.loadUrl("http://13.229.207.148/");
        // wb.loadUrl("https://www.google.com");

        //wb.loadUrl("http://13.251.164.198:9191");

    }
}
