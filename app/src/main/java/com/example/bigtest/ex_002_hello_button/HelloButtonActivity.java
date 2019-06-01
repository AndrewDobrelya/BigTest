package com.example.bigtest.ex_002_hello_button;

import android.app.Activity;
import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bigtest.R;

public class HelloButtonActivity extends Activity {

    private LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex002_hello_button_layout);
        linearLayout = (LinearLayout) findViewById(R.id.hello_button_layout);
    }


    public void click(View view){
        Button button = new Button(this);
        button.setText("Text button!!!");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        button.setLayoutParams(params);
        final TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello world!!!");
            }
        });
        linearLayout.addView(textView);
        linearLayout.addView(button );
    }
}
