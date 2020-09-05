package com.example.realintentproblem2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    EditText etA, etB, etC;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA=(EditText)findViewById(R.id.etA);
        etB=(EditText)findViewById(R.id.etB);
        etC=(EditText)findViewById(R.id.etC);
        r=new Random();
    }

    public void randomNumbers(View view)
    {
        etA.setText(""+r.nextDouble());
        etB.setText(""+r.nextDouble());
        etC.setText(""+r.nextDouble());
    }
}