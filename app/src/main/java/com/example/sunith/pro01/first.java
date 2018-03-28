package com.example.sunith.pro01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by sunith on 18-09-2017.
 */

public class first extends AppCompatActivity {



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ImageView img2=(ImageView)findViewById(R.id.img22);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadegoneman);
        img2.startAnimation(animation);
        Thread splashThread= new Thread()
        {
          @Override
          public void run()
          {
           try
           {
               int wait=0;
               while(wait<5000)
               {
                   sleep(100);
                   wait+=100;
               }
           } catch (InterruptedException e) {

           }finally {
               finish();
               Intent n=new Intent(first.this,MainActivity.class);
               startActivity(n);
           }
          }
        };
        splashThread.start();
    }
}
