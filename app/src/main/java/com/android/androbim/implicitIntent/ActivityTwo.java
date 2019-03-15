package com.android.androbim.implicitIntent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.androbim.R;

public class ActivityTwo extends AppCompatActivity {

    TextView tvName;
    String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvName = findViewById(R.id.txt_name);

        strName = getIntent().getStringExtra("keyName");
        tvName.setText(strName);

    }
}
