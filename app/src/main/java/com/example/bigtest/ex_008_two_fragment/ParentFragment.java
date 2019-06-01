package com.example.bigtest.ex_008_two_fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bigtest.R;

public class ParentFragment extends Fragment {

    Fragment childFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.ex008_parent_fragment, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

    }


    public void CreateChild(){
        childFragment = new ChildFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
//        transaction.add(R.id.ex008_third_in_fourth_fragment,childFragment).commit();
        transaction.replace(R.id.child_fragment_container, childFragment).commit();
    }




}
