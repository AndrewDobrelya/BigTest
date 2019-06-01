package com.example.bigtest.ex_010_simple_interface1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bigtest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InterfaceFragment2 extends Fragment implements Intarface1Activity.OnActivityDataListener {

    private TextView textViewFragment2;

    public InterfaceFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.ex010_interface_fragment2, container, false);
        textViewFragment2 = view.findViewById(R.id.ex010_textViewFragment2);
        return view;
    }

    @Override
    public void onActivityDataListener(String data) {
       textViewFragment2.setText(data);
    }
}
