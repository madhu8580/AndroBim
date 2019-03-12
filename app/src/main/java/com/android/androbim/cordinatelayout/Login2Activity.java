package com.android.androbim.cordinatelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.androbim.R;

public class Login2Activity extends AppCompatActivity {

    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        btnSignIn = findViewById(R.id.btnLogin2);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSign = new Intent(getApplicationContext(), VerifyEmailActivity.class);
                startActivity(iSign);
            }
        });
    }
}
