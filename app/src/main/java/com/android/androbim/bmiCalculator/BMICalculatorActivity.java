package com.android.androbim.bmiCalculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.androbim.R;

import java.text.DecimalFormat;

public class BMICalculatorActivity extends AppCompatActivity {

    EditText etBmiHeight, etBmiWeight;
    Button btnBmiCheck;
    TextView tvBmiValue, tvBmiResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        etBmiHeight = findViewById(R.id.et_bmi_height);
        etBmiWeight = findViewById(R.id.et_bmi_weight);
        btnBmiCheck = findViewById(R.id.btn_bmi_check);
        tvBmiResult = findViewById(R.id.tv_bmi_result);
        tvBmiValue = findViewById(R.id.tv_bmi_value);

        btnBmiCheck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ((etBmiHeight.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(), "Enter the values", Toast.LENGTH_LONG).show();
                } else if ((etBmiWeight.getText().toString().equals(""))) {
                    Toast.makeText(getApplicationContext(), "Enter the values", Toast.LENGTH_LONG).show();
                } else {

                    final DecimalFormat df = new DecimalFormat(".##");
                    double height, weight, heightinmeters, bmi, finalht;

                    height = Double.parseDouble(etBmiHeight.getText().toString());
                    weight = Double.parseDouble(etBmiWeight.getText().toString());

                    heightinmeters = height * 0.3048;
                    finalht = heightinmeters * heightinmeters;
                    bmi = weight / finalht;
                    tvBmiValue.setText("" + df.format(bmi));

                    if (bmi < 18.5) {
                        tvBmiResult.setText("UNDER WEIGHT");
                    } else if (bmi > 18.5 && bmi < 24.9) {
                        tvBmiResult.setText("NORMAL WEIGHT");
                    } else if (bmi > 25 && bmi < 29.9) {
                        tvBmiResult.setText("OVER WEIGHT");
                    } else if (bmi > 30 && bmi < 39.9) {
                        tvBmiResult.setText("OBESITY");
                    } else if (bmi > 40) {
                        tvBmiResult.setText("SEVER OBESITY");
                    }
                }
            }
        });
    }
}