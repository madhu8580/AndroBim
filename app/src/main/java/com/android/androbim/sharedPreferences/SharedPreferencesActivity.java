package com.android.androbim.sharedPreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.androbim.R;

public class SharedPreferencesActivity extends AppCompatActivity {

    Button btnPreferenceClick;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sharedPreferences = getSharedPreferences("MODE", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnPreferenceClick = findViewById(R.id.btn_preference_click);
        btnPreferenceClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editor.putInt("NEXT", 1);
                editor.apply();

                Intent i = new Intent(SharedPreferencesActivity.this, PreferencesNextActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (sharedPreferences.getInt("NEXT", 0) == 1) {
            Intent i = new Intent(SharedPreferencesActivity.this, PreferencesNextActivity.class);
            startActivity(i);
        }
    }
}
