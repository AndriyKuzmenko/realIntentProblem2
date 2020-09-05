package com.example.realintentproblem2;

import androidx.appcompat.app.AppCompatActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA=(EditText)findViewById(R.id.etA);
        etB=(EditText)findViewById(R.id.etB);
        etC=(EditText)findViewById(R.id.etC);
        myRandom=new Random();
    }

    public void randomNumbers(View view)
    {
        etA.setText(""+myRandom.nextInt());
        etB.setText(""+myRandom.nextInt());
        etC.setText(""+myRandom.nextInt());
    }

    public void showResult(View view)
    {
        aS=etA.getText().toString();
        bS=etB.getText().toString();
        cS=etC.getText().toString();
        if (!(check(aS) && check(bS) && check(cS))) return;
        a=Double.parseDouble(aS);
        b=Double.parseDouble(bS);
        c=Double.parseDouble(cS);
    }

    public boolean check(String x)
    {
        try
        {
            double d = Double.parseDouble(x);
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(getApplicationContext(), "Type a number!!!!!!!!!!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}