package com.android.androbim.custom_list_view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.androbim.R;

public class CustomListBaseAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    private String[] name;
    private String[] email;

    public CustomListBaseAdapter(Context context, String[] name, String[] email) {

        this.context = context;
        this.name = name;
        this.email = email;
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

        View view = layoutInflater.inflate(R.layout.adapter_custom_list, null);
        TextView txtName, txtEmail;

        txtName = view.findViewById(R.id.txt_adapter_name);
        txtEmail = view.findViewById(R.id.txt_adapter_email);

        txtName.setText("" + name[position]);
        txtEmail.setText("" + email[position]);

        return view;
    }
}
