package com.android.androbim.tabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.androbim.R;

public class TopGamesFragment extends Fragment {

    ListView listGamesTop;

    String[] str = {"PUBG", "CRICKET", "CHESS", "CAREM BOARD", "FOOTBALL"};
    ArrayAdapter<String> arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_games_top, container, false);

        listGamesTop = view.findViewById(R.id.list_top_games);
        arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, str);
        listGamesTop.setAdapter(arrayAdapter);
        return view;
    }
}
