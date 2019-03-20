package com.android.androbim.implicitIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.androbim.R;

public class ResultActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtResult = findViewById(R.id.txt_result);

        double d = getIntent().getDoubleExtra("addition", 0);
        txtResult.setText(Double.toString(d));

        String s = getIntent().getStringExtra("output");
//        String s1 = getIntent().getStringExtra("two");

//        txtResult.setText(s + " " + s1);
        txtResult.setText(s);
    }
}
