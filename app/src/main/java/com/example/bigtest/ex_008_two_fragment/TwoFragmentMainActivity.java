package com.example.bigtest.ex_008_two_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.bigtest.R;

public class TwoFragmentMainActivity extends AppCompatActivity {

    ParentFragment parentFragment;
    TwoFirstActivity fragment;
    TwoSecondActivity fragment2;
    FragmentManager fragmentManager;
    Button addButton;
    Button deleteButton;
    Button replaceButton;
    Button newFragmentButton;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex008_main_layout);
        fragmentManager = getSupportFragmentManager();
        fragment = new TwoFirstActivity();
        fragment2 = new TwoSecondActivity();
        addButton = findViewById(R.id.ex008_add_button);
        deleteButton = findViewById(R.id.ex008_delete_button);
        replaceButton = findViewById(R.id.ex008_replace_button);
        newFragmentButton = findViewById(R.id.ex008_new_fragment_button);
        addButton.setOnClickListener(buttonListener);
        deleteButton.setOnClickListener(buttonListener);
        replaceButton.setOnClickListener(buttonListener);
        newFragmentButton.setOnClickListener(buttonListener);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.parent_fragment_container, new ParentFragment());
        ft.commit();

    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fragmentTransaction = fragmentManager.beginTransaction();
            switch (v.getId())
            {
                case R.id.ex008_add_button:
//
                        if (fragmentManager.findFragmentByTag(TwoFirstActivity.TAG) == null) {

                            fragmentTransaction.add(R.id.ex008_first_or_second_fragment, fragment, TwoFirstActivity.TAG).commit();
                        }
//
                        break;
                case R.id.ex008_delete_button:
//
                if (fragmentManager.findFragmentByTag(TwoFirstActivity.TAG) != null) {
                    fragmentTransaction.remove(fragment).commit();
                }
                if (fragmentManager.findFragmentByTag(TwoSecondActivity.TAG) != null) {
                    fragmentTransaction.remove(fragment2).commit();
                }
//
                break;
                case R.id.ex008_replace_button:
//
                    if (fragmentManager.findFragmentByTag(TwoFirstActivity.TAG) != null) {
                        fragmentTransaction.replace(R.id.ex008_first_or_second_fragment,fragment2,TwoSecondActivity.TAG).commit();
                    }
                    if (fragmentManager.findFragmentByTag(TwoSecondActivity.TAG) != null) {
                        fragmentTransaction.replace(R.id.ex008_first_or_second_fragment,fragment,TwoFirstActivity.TAG).commit();
                    }
//
                    break;

                case R.id.ex008_new_fragment_button:
                   parentFragment = (ParentFragment) getSupportFragmentManager().findFragmentById(R.id.parent_fragment_container);
                   parentFragment.CreateChild();
                  break;
            }

        }
    };


}
