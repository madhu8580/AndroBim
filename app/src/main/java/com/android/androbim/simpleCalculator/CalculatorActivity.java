package com.android.androbim.simpleCalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.androbim.R;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etFNo, etSNo;
    private TextView tvResult;
    private Button btnAdd, btnSub, btnMul, btnDiv, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        iniUi();
    }

    private void iniUi() {

        etFNo = findViewById(R.id.et_f_no);
        etSNo = findViewById(R.id.et_s_no);

        tvResult = findViewById(R.id.tv_result);

        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnClear = findViewById(R.id.btn_clear);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double fName = Double.parseDouble(etFNo.getText().toString());
        double sName = Double.parseDouble(etSNo.getText().toString());

        double result = 0;

        switch (v.getId()) {
            case R.id.btn_add:
                result = fName + sName;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_sub:
                result = fName - sName;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_mul:
                result = fName * sName;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_div:
                result = fName / sName;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_clear:
                etFNo.getText().clear();
                etSNo.getText().clear();
                tvResult.setText("");

                break;

        }
    }
}
