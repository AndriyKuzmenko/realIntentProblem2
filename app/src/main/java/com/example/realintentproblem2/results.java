package com.example.realintentproblem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class results extends AppCompatActivity
{
    Intent gi;
    double a,b,c;

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
    }
}
