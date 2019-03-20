package com.android.androbim.implicitIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.androbim.R;

public class AdditionOperation extends AppCompatActivity {

    EditText etFirstNo, etSecondNo;
    Button btnAdd;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_operation);

        etFirstNo = findViewById(R.id.et_first_no);
        etSecondNo = findViewById(R.id.et_second_no);
//        result = findViewById(R.id.txt_result);
        btnAdd = findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double num1 = Double.parseDouble(etFirstNo.getText().toString());
                double num2 = Double.parseDouble(etSecondNo.getText().toString());

                double sum = num1 + num2;

//                result.setText(Double.toString(sum));

                Intent i = new Intent(getApplicationContext(), ResultActivity.class);
                i.putExtra("addition", sum);
                startActivity(i);

            }
        });
    }
}
