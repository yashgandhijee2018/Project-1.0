package com.demo.incampus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddPfPJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpfp_java);
    }

    public void done (View view) {
        Intent intent = new Intent(getApplicationContext(),CourseSpinnerActivity.class);
        startActivity(intent);
    }
}
