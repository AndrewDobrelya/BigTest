package com.example.bigtest.ex_010_simple_interface1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bigtest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InterfaceFragment1 extends Fragment {


    private Button buttonFragment1;
    private EditText editTextFragment1;

    public InterfaceFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ex010_interface_fragment1, container, false);

        buttonFragment1 = view.findViewById(R.id.ex010_buttonFragment1);
        editTextFragment1 = view.findViewById(R.id.ex010_editTextFragment1);
        buttonFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editTextFragment1.getText().toString();
                dataLisener.onFragmentDataLisener(data);
            }
        });

        return view;
    }

    public interface OnFragmentDataLisener{
        void onFragmentDataLisener(String str);
    }

    private OnFragmentDataLisener dataLisener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentDataLisener){
            dataLisener = (OnFragmentDataLisener) context;
        }
        else
            throw new RuntimeException(context.toString() + " must implement OnFragment1DataListener");
    }
}
