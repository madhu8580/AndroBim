package com.android.androbim.implicitIntent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.androbim.R;

public class One extends AppCompatActivity {

    TextView tvName;
    Button btnSubmit;

    String strName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        tvName = findViewById(R.id.txt_name);
        btnSubmit = findViewById(R.id.button);

        strName = tvName.getText().toString();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent o = new Intent(One.this, Two.class);
                o.putExtra("keyName", strName);
                startActivity(o);
            }
        });
    }
}
