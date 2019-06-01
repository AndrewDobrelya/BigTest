package com.example.bigtest.ex_008_two_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bigtest.R;

public class ThirdFragment extends Fragment {
    public static final String TAG = "FirstFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.ex008_third_fragment, viewGroup,false);
        return view;

    }
}
