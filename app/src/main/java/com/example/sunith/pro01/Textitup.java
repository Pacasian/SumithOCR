package com.example.sunith.pro01;

import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.NullPointerException;

/**
 * Created by sunith on 15-09-2017.
 */

public class Textitup extends AppCompatActivity implements View.OnClickListener {
    String agrus;

    String Viewlabel;
    TextView viewbro;


    @Override
    @Nullable
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textitup);
        viewbro=(TextView)findViewById(R.id.textView1);
        viewbro.setMovementMethod(new ScrollingMovementMethod());
        //Viewbro=getIntent().getExtras().getString("value");
        Button btnlabel=(Button)findViewById(R.id.button2);
        btnlabel.setOnClickListener(this);
        Viewlabel=getIntent().getExtras().getString("label");
        try{
            String[] arr = Viewlabel.split("\n");
            String haii=arr[3];
            agrus=haii;
            Toast.makeText(this,haii, Toast.LENGTH_SHORT).show();
        }
        catch (NullPointerException e)
        {
            viewbro.setText("Error");
        }
        viewbro.setText(agrus);
    }

    @Override

    public void onClick(View v) {
        Toast.makeText(this, "hai", Toast.LENGTH_SHORT).show();
        //Viewlabel=getIntent().getExtras().getString("label");
        //try{
          //  String[] arr = Viewlabel.split("\n");
            //String haii=arr[4];
            //agrus=haii;
            //Toast.makeText(this,haii, Toast.LENGTH_SHORT).show();
            //}
        //catch (NullPointerException e)
        //{
          //  viewbro.setText("Error");
        //}
       // viewbro.setText(agrus);
    }
}
