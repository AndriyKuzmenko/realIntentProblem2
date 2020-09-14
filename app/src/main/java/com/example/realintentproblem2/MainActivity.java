package com.example.realintentproblem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    EditText etA, etB, etC;
    Random myRandom;
    double a,b,c;
    String aS,bS,cS;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA=(EditText)findViewById(R.id.etA);
        etB=(EditText)findViewById(R.id.etB);
        etC=(EditText)findViewById(R.id.etC);
        myRandom=new Random();
        si=new Intent(this, results.class);
    }

    public void randomNumbers(View view)
    {
        etA.setText(""+((double)myRandom.nextInt())/100000);
        etB.setText(""+((double)myRandom.nextInt())/100000);
        etC.setText(""+((double)myRandom.nextInt())/100000);
    }

    public void showResult(View view)
    {
        aS=etA.getText().toString();
        bS=etB.getText().toString();
        cS=etC.getText().toString();
        if (!(check(aS,'a') && check(bS,'b') && check(cS,'c'))) return;
        a=Double.parseDouble(aS);
        b=Double.parseDouble(bS);
        c=Double.parseDouble(cS);
        si.putExtra("a",a);
        si.putExtra("b",b);
        si.putExtra("c",c);
        startActivity(si);
    }

    public boolean check(String x,char ch)
    {
        try
        {
            double d = Double.parseDouble(x);
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(getApplicationContext(), "You forgot to give the value of "+ch+"!!!!!!!!!!!!!!!!!!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}