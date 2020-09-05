package com.example.realintentproblem2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class results extends AppCompatActivity
{
    Intent gi;
    double a,b,c;
    WebView webView;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        gi=getIntent();
        a=gi.getDoubleExtra("a",0);
        b=gi.getDoubleExtra("b",0);
        c=gi.getDoubleExtra("c",0);
        //Because the code checks are the numbers correct
        //before sending them, the default value doesn't
        //matter.
        webView=(WebView)findViewById(R.id.webView);
        answer=(TextView)findViewById(R.id.answer);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new myWV());

        String equation="https://www.google.com/search?q=";
        equation+=a + "x%5E2%2B" + b + "x%2B" + c + "&aqs=chrome.0.69i59j0l7.3454j0j9&sourceid=chrome&ie=UTF-8";
        webView.loadUrl(equation);
        calculate();
    }

    public void calculate()
    {
        double d=b*b-4*a*c;
        if (d<0)
        {
            answer.setText("This equation doesn't have solutions because D<0. (D="+d+")");
        }
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
