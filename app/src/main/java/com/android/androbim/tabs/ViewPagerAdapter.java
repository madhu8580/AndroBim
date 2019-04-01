package com.android.androbim.tabs;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    Fragment fragment;
    String s;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                fragment = new TopGamesFragment();
                break;

            case 1:
                fragment = new TopBooksFragment();
                break;

            case 2:
                fragment = new TopSongsFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                s = "TOP GAMES";
                break;

            case 1:
                s = "TOP BOOKS";
                break;

            case 2:
                s = "TOOP SONGS";
                break;
        }

        return s;
    }
}
