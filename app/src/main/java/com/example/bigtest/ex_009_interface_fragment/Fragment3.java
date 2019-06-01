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
public class Fragment3 extends Fragment {

    private EditText editTextFragment3;
    private TextView textViewFragment3;
    private Button buttonFragment3;
    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ex009_fragment_fragment3, container, false);

        editTextFragment3 = (EditText) view.findViewById(R.id.ex009_editTextFragment3);
        textViewFragment3 = (TextView) view.findViewById(R.id.ex009_textViewFragment3);
        buttonFragment3 = (Button) view.findViewById(R.id.ex009_buttonFragment3);

        buttonFragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

}
