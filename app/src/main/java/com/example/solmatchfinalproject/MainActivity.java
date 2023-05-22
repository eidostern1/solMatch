package com.example.solmatchfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import dataBase.MyInfoManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        setContentView(R.layout.activity_login);
        MyInfoManager.getInstance().openDataBase(this);

    }


}