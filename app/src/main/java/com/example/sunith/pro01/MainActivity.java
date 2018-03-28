package com.example.sunith.pro01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        btnlogin=(Button)findViewById(R.id.loginbtn);
        btnlogin.setOnClickListener(this);
        TextView tx1=(TextView)findViewById(R.id.tx);

    }

    @Override
    public void onClick(View v) {
        String st="hai";
        Intent i= new Intent(MainActivity.this,Home.class);
        i.putExtra("haiman",st);
        startActivity(i);
    }
    public void abc(View v)
    {
        Intent j = new Intent(this,Page0_1.class);
        startActivity(j);
    }
}
