package com.demo.incampus;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class OTPJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //if the system api is below marshmallow, set status bar to default black
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            getWindow().setStatusBarColor(Color.BLACK);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_java);

        //TextWatcher so that the focus automatically moves with the number entered.
        final StringBuilder sb = new StringBuilder();
        final EditText editTextOne = findViewById(R.id.editTextone);
        final EditText editTextTwo = findViewById(R.id.editTexttwo);

        editTextOne.addTextChangedListener(new TextWatcher() {
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(sb.length()==0 && editTextOne.length()==1) {
                    sb.append(s);
                    editTextOne.clearFocus();

                    editTextTwo.requestFocus();
                    editTextTwo.setCursorVisible(true);

                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }
            public void afterTextChanged(Editable s) {

            }
        });


    }
}
