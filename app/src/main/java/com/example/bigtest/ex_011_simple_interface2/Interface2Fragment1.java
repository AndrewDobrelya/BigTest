package com.example.bigtest.ex_011_simple_interface2;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.bigtest.R;
import com.example.bigtest.ex_011_simple_interface2.res.OnClickListener;
import com.example.bigtest.ex_011_simple_interface2.res.OnDataListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class Interface2Fragment1 extends Fragment implements OnClickListener {

    private EditText editText;
    private OnDataListener onDataListener;
    public Interface2Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.ex011_interface_fragment1, container, false);
        editText = view.findViewById(R.id.ex011_editTextFragment1);
        return view;
    }

    @Override
    public void onClickListener() {
        String res = editText.getText().toString();
        onDataListener.onDataListener(res);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnDataListener)
            onDataListener = (OnDataListener) context;
        else
            throw new RuntimeException(context.toString() +"context must implement OnDataListener");
    }
}
