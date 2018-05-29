package com.radioorma.www.radioorma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    private FloatingActionButton mFloatingButton;

    private boolean isActive = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        mFloatingButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://www.radioorma.com/");
        setupNotificationFloating();
    }

    private void setupNotificationFloating() {

        mFloatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isActive = !isActive;
                if (isActive) {
                    enableNotifications();
                } else {
                    disableNotifications();
                }

            }
        });
    }

    private void enableNotifications() {
        mFloatingButton.setImageResource(R.mipmap.ic_alert_on);
        //TODO
    }

    private void disableNotifications() {
        mFloatingButton.setImageResource(R.mipmap.ic_alert_off);
        //TODO
    }

}
