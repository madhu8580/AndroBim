package com.android.androbim.simpleListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.androbim.R;

public class ListViewActivity1 extends AppCompatActivity {

    ListView listView;
    String[] stringArray = {"Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja", "Madhu", "Druva", "Mounika", "Raja"};
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);

        listView = findViewById(R.id.listView1);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, stringArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + stringArray[position], Toast.LENGTH_LONG);
            }
        });

    }
}
