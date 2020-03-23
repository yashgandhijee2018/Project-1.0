package com.demo.incampus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class VerifyNumberActivity extends AppCompatActivity {

    private ArrayList<CountryCodeAdapter.CountryCode> mCode;
    private CountryCodeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_number);

        codeList();

        Spinner spinner = findViewById(R.id.spinner);

        adapter = new CountryCodeAdapter(this,mCode);
        spinner.setAdapter(adapter);

        spinner.getOnItemSelectedListener();
    }

    private void codeList() {
        mCode = new ArrayList<>();
        mCode.add(new CountryCodeAdapter.CountryCode("+91"));
        mCode.add(new CountryCodeAdapter.CountryCode("+92"));
        mCode.add(new CountryCodeAdapter.CountryCode("+93"));
        mCode.add(new CountryCodeAdapter.CountryCode("+94"));
        mCode.add(new CountryCodeAdapter.CountryCode("+95"));
    }
}
