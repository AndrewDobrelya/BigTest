package com.example.bigtest.ex_011_simple_interface2;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bigtest.R;
import com.example.bigtest.ex_011_simple_interface2.res.OnClickListener;
import com.example.bigtest.ex_011_simple_interface2.res.OnDataListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class Interface2Fragment2 extends Fragment implements OnDataListener {

    private TextView textView;
    private Button button;
    private OnClickListener clickListener;


    public Interface2Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.ex011_interface_fragment2, container, false);
        textView = view.findViewById(R.id.ex011_textViewFragment2);
        button = view.findViewById(R.id.ex011_buttonFragment2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClickListener();
            }
        });

        return view;
    }

    @Override
    public void onDataListener (String string) {
        textView.setText(string);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnClickListener)
            clickListener = (OnClickListener) context;
        else throw new
                RuntimeException(context.toString()+"context must implement OnClickListener");
    }
}
