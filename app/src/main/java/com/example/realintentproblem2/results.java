package com.example.realintentproblem2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class results extends AppCompatActivity
{
    Intent gi;
    double a,b,c;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        gi=getIntent();
        a=gi.getDoubleExtra("a",0);
        b=gi.getDoubleExtra("a",0);
        c=gi.getDoubleExtra("a",0);
        //Because the code checks are the numbers correct
        //before sending them, the default value doesn't
        //matter.
        webView=(WebView)findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new myWV());

        String equation="https://www.google.com/search?q=";
        if (a!=0 && a!=1 && b!=0 && b!=1 && c!=0 && c!=1)
        {
            equation+=a + "x%5E2%2B" + b + "x%2B" + c + "&aqs=chrome.0.69i59j0l7.3454j0j9&sourceid=chrome&ie=UTF-8";
            webView.loadUrl(equation);
        }

        if (a!=1)
        {
            equation+=a;
        }
        equation+="x%5E2%2B";

        if (b==1)
        {
            equation+="x%2B";
        }
        else if (b!=0)
        {
            equation+=b+"x%2B";
        }

        equation+=c;
        webView.loadUrl(equation);
    }

    private class myWV extends WebViewClient
    {
        public boolean shouldOverideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}
