package com.hackathon.khidma27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void singUp(View view) {

        Intent myIntent = new Intent(this, SingUp.class);
        this.startActivity(myIntent);

    }

    public void login(View view) {

        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }
}


