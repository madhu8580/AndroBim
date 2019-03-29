package com.android.androbim.custom_list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.androbim.R;
import com.android.androbim.custom_list_view.adapter.CustomListBaseAdapter;

public class CustomListViewActivity extends AppCompatActivity {

    ListView listView;
    CustomListBaseAdapter customListBaseAdapter;

    String name[] = {"Madhu", "Vidya", "Madhu", "Vidya", "Madhu", "Vidya", "Madhu", "Vidya", "Madhu", "Vidya", "Madhu", "Vidya"};
    String email[] = {"madhu8580@gmail.com", "vidya8580@gmail.com", "madhu8580@gmail.com", "vidya8580@gmail.com", "madhu8580@gmail.com", "vidya8580@gmail.com", "vidya8580@gmail.com", "vidya8580@gmail.com", "vidya8580@gmail.com", "vidya8580@gmail.com", "vidya8580@gmail.com", "vidya8580@gmail.com"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView = findViewById(R.id.custom_list_view);

        customListBaseAdapter = new CustomListBaseAdapter(this, name, email);
        listView.setAdapter(customListBaseAdapter);

    }
}