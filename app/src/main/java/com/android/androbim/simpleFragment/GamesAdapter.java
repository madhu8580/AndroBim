package com.android.androbim.simpleFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.androbim.R;

public class GamesAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    Context context;
    String[] name;

    public GamesAdapter(Context context, String[] name) {
        this.context = context;
        this.name = name;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.adapter_games, null);
        TextView txtGameName = view.findViewById(R.id.txt_game_name);
        txtGameName.setText("" + name[position]);
        return view;
    }
}
