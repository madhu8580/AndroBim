package com.android.androbim.simpleCalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.androbim.R;

public class Practice extends AppCompatActivity implements View.OnClickListener {

    private EditText etFNumber, etSNumber;
    private Button btnAdd, btnSub, btnMul, btnDiv, btnClear;
    private TextView tvResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        iniUi();
    }

    private void iniUi() {

        etFNumber = findViewById(R.id.et_f_no);
        etSNumber = findViewById(R.id.et_s_no);

        btnAdd = findViewById(R.id.btn_add);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);
        btnClear = findViewById(R.id.btn_clear);

        tvResult = findViewById(R.id.tv_result);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double fNumber = Double.parseDouble(etFNumber.getText().toString());
        double sNumber = Double.parseDouble(etSNumber.getText().toString());

        double result;

        switch (v.getId()) {

            case R.id.btn_add:
                result = fNumber + sNumber;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_div:
                result = fNumber / sNumber;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_mul:
                result = fNumber * sNumber;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_sub:
                result = fNumber - sNumber;
                tvResult.setText(" " + result);
                break;

            case R.id.btn_clear:
                etSNumber.getText().clear();
                etFNumber.getText().clear();
                tvResult.setText("");
                break;

        }
    }
}
