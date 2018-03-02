package com.jw0160.containeclipsedirdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.eclipseasdemo.EclipseDemoActivity;

public class Main1Activity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onJump(View view){
        startActivity(new Intent(this, EclipseDemoActivity.class));
    }

    public void onJumpMain(View view){
        startActivity(new Intent(this, com.example.eclipseasdemo.MainActivity.class));
    }
}
