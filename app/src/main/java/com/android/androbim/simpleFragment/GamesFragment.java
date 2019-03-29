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

public class GamesFragment extends Fragment {

    String[] names = {"Madhu", "Mounika", "Druva", "Kumari", "Shalini", "Gayi", "Babu", "Munikrishna reddy"};
    GamesAdapter gamesAdapter;
    ListView lvGames;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_games, container, false);
        lvGames = view.findViewById(R.id.lv_games);

        gamesAdapter = new GamesAdapter(getActivity(), names);
        lvGames.setAdapter(gamesAdapter);
        return view;
    }
}
