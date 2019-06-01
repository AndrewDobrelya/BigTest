package com.example.bigtest.ex_009_interface_fragment;

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

public class InterfaceFragmentActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button button;
    private FrameLayout fragmentContainer;
    private FrameLayout fragmentContainer2;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex009_activity_main);

        editText = (EditText)findViewById(R.id.ex009_editText);
        textView = (TextView)findViewById(R.id.ex009_textView);
        button = (Button)findViewById(R.id.ex009_button);
        fragmentContainer = (FrameLayout)findViewById(R.id.ex009_fragmentContainer);
        fragmentContainer2 = (FrameLayout)findViewById(R.id.ex009_fragmentContainer2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        fm =   getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.ex009_fragmentContainer);
        if(fragment == null){
            fragment = new Fragment1();
            fm.beginTransaction()
                    .add(R.id.ex009_fragmentContainer, fragment)
                    .commit();
        }


    }
}
