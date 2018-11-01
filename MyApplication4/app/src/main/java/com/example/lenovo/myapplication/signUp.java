package com.example.lenovo.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.example.lenovo.myapplication.dummy.login;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;


public class signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onFacebookClick(View v){
        finish();
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onGoogleClick(View v){
        finish();
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onRegisterClick(View v){
        finish();
        Intent intent=new Intent(this, login.class);
        startActivity(intent);
    }

}
