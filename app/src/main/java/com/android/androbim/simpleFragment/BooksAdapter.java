package com.android.androbim.simpleFragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.androbim.R;

public class BooksAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    String[] name;

    public BooksAdapter(Context context, String[] name) {

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

        View view = layoutInflater.inflate(R.layout.adapter_books, null);
        TextView txtBookName = view.findViewById(R.id.txt_book_name);
        txtBookName.setText("" + name[position]);
        return view;
    }
}
