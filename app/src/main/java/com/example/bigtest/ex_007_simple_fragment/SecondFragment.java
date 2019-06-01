package com.example.bigtest.ex_007_simple_fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.bigtest.R;

public class SecondFragment extends Fragment implements View.OnClickListener{
    TextView textView;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaneState){
        View view = inflater.inflate(R.layout.ex007_second_fragment, null);
        textView = view.findViewById(R.id.result);
        button = view.findViewById(R.id.ex007_btn_second_fragment);
        button.setOnClickListener(this);
        return view;
    }

//    @Override
//    public void onResume(){
//        super.onResume();
//        Button activityBtn = getActivity().findViewById(R.id.ex007_btn_main_fragment);
//        activityBtn.setOnClickListener((v) -> textView.setText("Hello from Activity"));
//    }

    @Override
    public void onClick(View v) {
        Activity activity = getActivity();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.frame_second_fragment);
        TextView textView = fragment.getView().findViewById(R.id.result);
        textView.setText("Hello from second Activity");
    }
}
