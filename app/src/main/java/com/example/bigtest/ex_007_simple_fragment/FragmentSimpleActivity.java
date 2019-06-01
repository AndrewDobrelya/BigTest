package com.example.bigtest.ex_007_simple_fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bigtest.R;

public class FragmentSimpleActivity extends Activity implements View.OnClickListener {

    private TextView textView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex007_main_layout);
        textView = findViewById(R.id.result);
        initSecondFragment();
        initFirstFragment();
    }

    private void initSecondFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame_second_fragment, new SecondFragment()).commit();
    }

    private void initFirstFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(R.id.frame_first_fragment, new FirstFragment());
        ft.commit();
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        Fragment fragment = getFragmentManager().findFragmentById(R.id.frame_first_fragment);
//    }

    @Override
    public void onClick(View v) {
        textView.setText("Hello from FragmentSimpleActivity");
    }
}
