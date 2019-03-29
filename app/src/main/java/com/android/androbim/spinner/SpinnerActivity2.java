package com.android.androbim.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.androbim.R;

public class SpinnerActivity2 extends AppCompatActivity {

    Spinner spinner;
    String[] stringsArray = {"*** Categories ***", "AutoMobiles", "TextTiles", "BookStalls", "Institutes"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);

        spinner = findViewById(R.id.spinerId);

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, stringsArray);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + stringsArray[position], Toast.LENGTH_LONG);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
