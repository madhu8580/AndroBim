package com.android.androbim.simpleFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.android.androbim.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBooks, btnGames;

    Fragment frg;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBooks = findViewById(R.id.books);
        btnGames = findViewById(R.id.games);

        btnBooks.setOnClickListener(this);
        btnGames.setOnClickListener(this);

        frg = new BooksFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_layout, frg);
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.books:

                frg = new BooksFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_layout, frg);
                fragmentTransaction.commit();
                break;

            case R.id.games:

                frg = new GamesFragment();
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_layout, frg);
                fragmentTransaction.commit();
                break;

        }
    }
}
