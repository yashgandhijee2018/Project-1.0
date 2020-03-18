package com.demo.incampus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class SignUpJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //if the system api is below marshmallow, set status bar to default black
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(Color.BLACK);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_java);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivityJava.class);
        startActivity(i);
    }

    public void go_to_signin_function(View view) {
        Intent i = new Intent(this, SignInJava.class);
        startActivity(i);
    }

    public void go_to_OTP_activity_function(View view)
    {
        Intent i=new Intent(this,OTPJava.class);
        startActivity(i);
    }
}
