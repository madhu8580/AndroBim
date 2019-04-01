package com.android.androbim.sharedPreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.androbim.R;

public class SharedPreferencesActivity2 extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    Button btnSharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnSharedPreferences = findViewById(R.id.btn_preference_click);

        sharedPreferences = getSharedPreferences("PREF", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnSharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SharedPreferencesActivity2.this, PreferencesNextActivity.class);
                startActivity(i);


                editor.putInt("NEXTACTIVITY", 1);
                editor.apply();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (sharedPreferences.getInt("NEXTACTIVITY", 0) == 1) {
            Intent i = new Intent(SharedPreferencesActivity2.this, PreferencesNextActivity.class);
            startActivity(i);
        }
    }
}
