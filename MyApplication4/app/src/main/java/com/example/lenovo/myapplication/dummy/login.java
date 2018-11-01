package com.example.lenovo.myapplication.dummy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lenovo.myapplication.MainActivity;
import com.example.lenovo.myapplication.R;
import com.example.lenovo.myapplication.fgtPwd;

public class login extends AppCompatActivity implements View.OnClickListener{


    Button login;
    TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.buttonLogin);
        forgotPassword = findViewById(R.id.tv);
        forgotPassword.setOnClickListener(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == login)
                {
                    finish();
                    Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == forgotPassword){
            finish();
            startActivity(new Intent(this, fgtPwd.class));

        }
    }
}
