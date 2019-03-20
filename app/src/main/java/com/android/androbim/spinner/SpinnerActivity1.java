package com.android.androbim.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.androbim.R;

public class SpinnerActivity1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner1;
    TextView txtSelectedItem;

    String string[] = {"*** Categories ***", "AutoMobiles", "TextTiles", "BookStalls", "Institutes"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner1);

        spinner1 = (Spinner) findViewById(R.id.sp_spinner1);
        txtSelectedItem = (TextView) findViewById(R.id.txt_selected_item);
        spinner1.setOnItemSelectedListener(this);

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, string);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = parent.getSelectedItem().toString();
        txtSelectedItem.setText(item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
