package com.example.vp1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
//import android.support.v7.appcompat.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class GamesFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_games, container, false);
         
        return rootView;
    }
}