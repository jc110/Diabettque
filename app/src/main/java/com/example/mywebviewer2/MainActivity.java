package com.example.mywebviewer2;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button5);
        btn2=(Button) findViewById(R.id.button4);
        web=(WebView) findViewById(R.id.WebView1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.setWebViewClient(new WebViewClient());
                web.loadUrl( "https://extension.ucsd.edu/");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                web.setWebViewClient(new WebViewClient());
                web.loadUrl( "https://www.yahoo.com");

            }
        });
    }
}