package com.android.androbim.implicitIntent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.androbim.R;

public class PassingData extends AppCompatActivity {

    EditText etInputOne, etInputTwo;
    Button btnSubmit;
    String valueOne, valueTwo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passingdata);

        etInputOne = findViewById(R.id.et_input_one);
        etInputTwo = findViewById(R.id.et_input_two);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

                valueOne = etInputOne.getText().toString();
                valueTwo = etInputTwo.getText().toString();

                String output = valueOne + valueTwo;

                /*intent.putExtra("one", valueOne);
                intent.putExtra("two", valueTwo);*/
                intent.putExtra("output", output);

                startActivity(intent);
            }
        });
    }
}
