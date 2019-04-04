package com.android.androbim.feetToMeterConverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.androbim.R;

public class FeetToMeterConverterActivity extends AppCompatActivity {

    EditText etFeet;
    Button btnMeterConvert;
    TextView tvMeterResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feet_to_meter_converter);

        etFeet = findViewById(R.id.et_feet);
        btnMeterConvert = findViewById(R.id.btn_meter_cal);
        tvMeterResult = findViewById(R.id.tv_meter_result);

        btnMeterConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double feet, result;
                feet = 6 * 0.3048;
                result = feet;
                feet = Double.parseDouble(etFeet.getText().toString());
                tvMeterResult.setText(" " + result);

            }
        });
    }
}
