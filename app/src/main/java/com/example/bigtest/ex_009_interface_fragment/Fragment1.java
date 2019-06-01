package com.example.bigtest.ex_009_interface_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bigtest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    private Button buttonFragment1;
    private EditText editTextFragment1;
    private TextView textViewFragment1;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ex009_fragment_fragment1, container, false);

        editTextFragment1 = view.findViewById(R.id.ex009_editTextFragment1);
        textViewFragment1 = (TextView) view.findViewById(R.id.ex009_textViewFragment1);
        buttonFragment1 = (Button) view.findViewById(R.id.ex009_buttonFragment1);

        buttonFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

}
