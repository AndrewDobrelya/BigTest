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
public class Fragment2 extends Fragment {


    private EditText editTextFragment2;
    private TextView textViewFragment2;
    private Button buttonFragment2;
    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ex009_fragment_fragment2, container, false);
        editTextFragment2 = (EditText) view.findViewById(R.id.ex009_editTextFragment2);
        textViewFragment2 = (TextView) view.findViewById(R.id.ex009_textViewFragment2);
        buttonFragment2 = (Button) view.findViewById(R.id.ex009_buttonFragment2);

        buttonFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

}
