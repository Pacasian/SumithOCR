package com.example.sunith.pro01;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by sunith on 13-09-2017.
 */

public class Page0_1 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page0_1);
        Spinner spinday=(Spinner)findViewById(R.id.dayspin);
        String [] days={"1","2","3","4","5","6","7","8","9","10"};
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,days);
        spinday.setAdapter(adapter);
        Spinner spinmonth=(Spinner)findViewById(R.id.monthspin);
        String [] months={"Jan","Feb","March","April","May","Jun","July","Aug","Sept","Oct","Nov","Dec"};
        ArrayAdapter adapter1= new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,months);
        spinmonth.setAdapter(adapter1);
        Spinner spinyear=(Spinner)findViewById(R.id.yearspin);
        String [] year={"1991","1992","1993","1994","1995","1996","1997","1998","1999","2001"};
        ArrayAdapter adapter2= new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,year);
        spinyear.setAdapter(adapter2);
        Button sign=(Button)findViewById(R.id.button);
        sign.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent o=new Intent(this,MainActivity.class);
        startActivity(o);
    }
}
