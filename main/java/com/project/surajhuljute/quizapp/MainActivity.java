package com.project.surajhuljute.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.support.v7.appcompat.R.styleable.View;
import static com.project.surajhuljute.quizapp.R.id.radioq1a;
import static com.project.surajhuljute.quizapp.R.id.radioq1c;

public class MainActivity extends AppCompatActivity  {
    int total=0;
    Button btn;
    RadioButton q1a,q1b,q1c,q1d,q2a,q2b,q2c,q2d,q3a,q3b,q3c,q3d,q4a,q4b,q4c,q4d,q5a,q5b,q5c,q5d;
    RadioGroup rg1,rg2,rg3,rg4,rg5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
        btn = (Button)findViewById(R.id.button);

        rg1=(RadioGroup)findViewById(R.id.radioGroup1);
        q1a=(RadioButton) findViewById(R.id.radioq1a);
        q1b=(RadioButton) findViewById(R.id.radioq1b);
        q1c=(RadioButton)findViewById(radioq1c);
        q1d=(RadioButton)findViewById(R.id.radioq1d);

        rg2=(RadioGroup)findViewById(R.id.radioGroup2);
        q2a=(RadioButton) findViewById(R.id.radioq2a);
        q2b=(RadioButton) findViewById(R.id.radioq2b);
        q2c=(RadioButton)findViewById(R.id.radioq2c);
        q2d=(RadioButton)findViewById(R.id.radioq2d);

        rg3=(RadioGroup)findViewById(R.id.radioGroup3);
        q3a=(RadioButton) findViewById(R.id.radioq3a);
        q3b=(RadioButton) findViewById(R.id.radioq3b);
        q3c=(RadioButton)findViewById(R.id.radioq3c);
        q3d=(RadioButton)findViewById(R.id.radioq3d);

        rg4=(RadioGroup)findViewById(R.id.radioGroup4);
        q4a=(RadioButton) findViewById(R.id.radioq4a);
        q4b=(RadioButton) findViewById(R.id.radioq4b);
        q4c=(RadioButton)findViewById(R.id.radioq4c);
        q4d=(RadioButton)findViewById(R.id.radioq4d);

        rg5=(RadioGroup)findViewById(R.id.radioGroup5);
        q5a=(RadioButton) findViewById(R.id.radioq5a);
        q5b=(RadioButton) findViewById(R.id.radioq5b);
        q5c=(RadioButton)findViewById(R.id.radioq5c);
        q5d=(RadioButton)findViewById(R.id.radioq5d);


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId == R.id.radioq1a) {
                    total=total-1;

                }
                else if (checkedId == R.id.radioq1b){
                    total=total-1;
                }
                else if (checkedId == R.id.radioq1c) {
                    total=total-1;
                }
                else{
                    total=total+5;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId == R.id.radioq2a) {
                    total=total-1;
                }
                else if (checkedId == R.id.radioq2b){
                    total=total+5;
                }
                else if (checkedId == R.id.radioq2c) {
                    total=total-1;
                }
                else{
                    total=total-1;
                }
            }
        });
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId == R.id.radioq3a) {
                    total=total-1;
                }
                else if (checkedId == R.id.radioq3b){
                    total=total-1;
                }
                else if (checkedId == R.id.radioq3c) {
                    total=total+5;
                }
                else{
                    total=total-1;
                }
            }
        });
        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId == R.id.radioq4a) {
                    total=total+5;
                }
                else if (checkedId == R.id.radioq4b){
                    total=total-1;
                }
                else if (checkedId == R.id.radioq4c) {
                    total=total-1;
                }
                else{
                    total=total-1;
                }
            }
        });
        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId == R.id.radioq5a) {
                    total=total-1;
                }
                else if (checkedId == R.id.radioq5b){
                    total=total+5;
                }
                else if (checkedId == R.id.radioq5c) {
                    total=total-1;
                }
                else{
                    total=total-1;
                }
            }

        });
    }


   public void show(View view) {


       String total1=String.valueOf(total);
       Toast.makeText(this,"YOUR SCHORE IS:"+total1,Toast.LENGTH_LONG).show();
       Intent i=new Intent(this,MainActivity.class);
       startActivity(i);
             }

   }

