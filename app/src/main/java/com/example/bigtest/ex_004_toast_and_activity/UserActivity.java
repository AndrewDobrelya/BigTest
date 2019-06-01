package com.example.bigtest.ex_004_toast_and_activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bigtest.R;

public class UserActivity extends Activity {

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.ex004_user_layout);

        TextView textView = findViewById(R.id.ex004_user_layout_text_view);
        String message = getIntent().getStringExtra("message");
        textView.setText(message);
    }

    public void exit(View view){
        finish();
    }
}
