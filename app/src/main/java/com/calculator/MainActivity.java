package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequal,bplus,bmin,bsum,bdiv,binv,bsqrt,bsquare,bfact,bIn,blog,btan,bcos,bsin,bb1,bb2,bac;
    TextView tvmain,tvsec;
    String pi="3.141529265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bdot=findViewById(R.id.bdot);
        bpi=findViewById(R.id.bpi);
        bequal=findViewById(R.id.bequal);
        bplus=findViewById(R.id.bplus);
        bmin=findViewById(R.id.bmin);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        binv=findViewById(R.id.bIn);
        bsqrt=findViewById(R.id.bsqrt);
        bsquare=findViewById(R.id.bsquare);
        bfact=findViewById(R.id.bfact);
        bIn=findViewById(R.id.bIn);
        blog=findViewById(R.id.blog);
        btan=findViewById(R.id.btan);
        bcos=findViewById(R.id.bcos);
        bsin=findViewById(R.id.bsin);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        bac=findViewById(R.id.bac);


        tvmain=findViewById(R.id.tvmain);
        tvsec=findViewById(R.id.tvsec);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void Onclick(View view) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });

     //custom factorial function
        int factorial (int n){
            return (n == 1 n == 0)?1:n * factorial(n - 1)

        }















    }
}