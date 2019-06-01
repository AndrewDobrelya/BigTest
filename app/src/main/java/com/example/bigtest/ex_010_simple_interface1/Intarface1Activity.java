package com.example.bigtest.ex_010_simple_interface1;

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

public class Intarface1Activity extends AppCompatActivity implements InterfaceFragment1.OnFragmentDataLisener {

    private EditText editText;
    private TextView textView;
    private Button button;
    private FrameLayout fragmentContainer;
    private FrameLayout fragmentContainer2;
    private FragmentManager fm;
   private Fragment fragment2;

    public interface OnActivityDataListener{
        void onActivityDataListener(String data);
    }

    private OnActivityDataListener dataListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex010_activity_intarface1);

        editText = findViewById(R.id.ex010_editText);
        textView = findViewById(R.id.ex010_textView);
        button = findViewById(R.id.ex010_button);
        fragmentContainer = findViewById(R.id.ex010_fragmentContainer);
        fragmentContainer2 = findViewById(R.id.ex010_fragmentContainer2);



        fm = getSupportFragmentManager();
        Fragment fragment1= fm.findFragmentById(R.id.ex010_fragmentContainer);
         fragment2= fm.findFragmentById(R.id.ex010_fragmentContainer2);
        if(fragment1 == null && fragment2 == null){
            fragment1 = new InterfaceFragment1();
            fragment2 = new InterfaceFragment2();
            if(fragment2 instanceof OnActivityDataListener){
                dataListener = (OnActivityDataListener) fragment2;
            }
            else{
                throw new RuntimeException(fragment2.toString()+ "must implement OnClickListener" );
            }
            fm.beginTransaction()
                    .add(R.id.ex010_fragmentContainer, fragment1).add(R.id.ex010_fragmentContainer2, fragment2)
                    .commit();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String str = editText.getText().toString();
              dataListener.onActivityDataListener(str);
            }
        });
    }

    @Override
    public void onFragmentDataLisener(String str) {
        textView.setText(str);
    }


}
