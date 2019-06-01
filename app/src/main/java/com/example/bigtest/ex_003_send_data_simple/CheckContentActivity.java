package com.example.bigtest.ex_003_send_data_simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.bigtest.R;

public class CheckContentActivity extends AppCompatActivity {

    private TextView checkTxt;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex003_check_content_layout);
        checkTxt = findViewById(R.id.check_content_text_view);
        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age",0);
        checkAge(age,name);

    }

    public void checkAge(int age, String name){
        if(age>=18)
            checkTxt.setText("Hello" +name+ "your age" + age);
        else
            checkTxt.setText("Permission denaid");
    }

    public void goToNewActivity(View view) {
        Intent intent = new Intent(this, MainNameActivity.class);
        startActivity(intent);
    }
}
