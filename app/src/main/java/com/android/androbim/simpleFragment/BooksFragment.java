package com.android.androbim.simpleFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.androbim.R;

public class BooksFragment extends Fragment {

    ListView lvBooks;
    String[] bookNames = {"Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu", "Madhu"};
    BooksAdapter booksAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_books, container, false);
        lvBooks = view.findViewById(R.id.lv_books);

        booksAdapter = new BooksAdapter(getActivity(), bookNames);
        lvBooks.setAdapter(booksAdapter);
        return view;

    }
}
