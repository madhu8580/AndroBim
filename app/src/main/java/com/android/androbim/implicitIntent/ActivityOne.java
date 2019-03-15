package com.android.androbim.implicitIntent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.androbim.R;

public class ActivityOne extends AppCompatActivity {

    EditText editText;
    Button button;
    String strName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        editText = findViewById(R.id.et_name);

        strName = editText.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
                intent.putExtra("keyName", strName);
                startActivity(intent);
            }
        });
    }
}
