package com.example.bigtest.ex_011_simple_interface2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.bigtest.R;

import com.example.bigtest.ex_011_simple_interface2.res.OnClickListener;
import com.example.bigtest.ex_011_simple_interface2.res.OnDataListener;

public class Interface2Activity extends AppCompatActivity implements OnDataListener, OnClickListener {


    private Button button;
    private EditText editText;
    private TextView textView;
    private FrameLayout fragmentContainer;
    private FrameLayout fragmentContainer2;
    private FragmentManager fm;

    private OnClickListener onClickListener;
    private OnDataListener onDataListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex011_activity_interface2);


        editText = findViewById(R.id.ex011_editText);
        textView = findViewById(R.id.ex011_textView);
        button = findViewById(R.id.ex011_button);
        fragmentContainer = findViewById(R.id.ex011_fragmentContainer);
        fragmentContainer2 = findViewById(R.id.ex011_fragmentContainer2);

        fm = getSupportFragmentManager();
        Fragment fragment1 = fm.findFragmentById(R.id.ex011_fragmentContainer);
        Fragment fragment2 = fm.findFragmentById(R.id.ex011_fragmentContainer2);
        if(fragment1 == null && fragment2 == null) {
            fragment1 = new Interface2Fragment1();
            if (fragment1 instanceof OnClickListener)
                onClickListener = (OnClickListener) fragment1;
            else throw new RuntimeException(fragment1.toString()+" must implement OnClickListener");
            fragment2 = new Interface2Fragment2();
            if (fragment2 instanceof OnDataListener)
                onDataListener = (OnDataListener) fragment2;
            else  throw new RuntimeException(fragment2.toString()+ "implement OnDataListener");
            fm.beginTransaction().add(R.id.ex011_fragmentContainer, fragment1)
                    .add(R.id.ex011_fragmentContainer2, fragment2).commit();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickListener.onClickListener();
            }
        });
    }

    @Override
    public void onDataListener(String data) {
        textView.setText(data);
    }

    @Override
    public void onClickListener() {
        String s = editText.getText().toString();
        onDataListener.onDataListener(s);
    }
}
