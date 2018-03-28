package com.example.sunith.pro01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by sunith on 15-09-2017.
 */

public class Home extends AppCompatActivity implements View.OnClickListener {
    Button btntest;
    Button btnclick;
    Button btndown;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btntest=(Button)findViewById(R.id.testbtn);
        btnclick=(Button)findViewById(R.id.clickbtn);
        btntest.setOnClickListener(this);
        String st1="";
        btndown =(Button)findViewById(R.id.btndownload);
        st1=getIntent().getExtras().getString("haiman");
        if(st1.equals("hai"))
        {
            ImageView img1=(ImageView)findViewById(R.id.img11);
            Animation animation=AnimationUtils.loadAnimation(this,R.anim.rotateclock);
            img1.startAnimation(animation);
        }

    }

    @Override
    public void onClick(View v) {
        Intent f= new Intent(this,Page1.class);
        startActivity(f);


    }
    public void pick(View v)
    {
        Toast.makeText(this,"Work on Progress...",Toast.LENGTH_LONG).show();
    }
    public void brobro(View v)
    {
        Intent d=new Intent(this,download.class);
        startActivity(d);
    }
}
