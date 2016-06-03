package com.example.iii_user.ming21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webview);
        initwebView();
    }
    public void initwebView (){
        WebSettings settings =  webView.getSettings();
        settings.setJavaScriptEnabled(true);
//        webView.loadUrl("http://www.iii.org.tw"); 唯一識別定位的位置
            webView.loadUrl("file:///android_asset/Lab_Map_3.html"); //我要連的是一樣東西 所以不要加s
    }
}
