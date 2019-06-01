package com.example.bigtest.ex_003_send_data_simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.example.bigtest.R;

public class MainNameActivity extends Activity {

    private EditText nameTxt;
    private EditText ageTxt;

    @Override
    public void onCreate(  Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex003_name_layout);
        nameTxt = findViewById(R.id.name_edit_text);
        ageTxt = findViewById(R.id.age_edit_text);
    }

    public void sendInformatin(View view) {
        Intent intent = new Intent(this,CheckContentActivity.class);
        int age = Integer.valueOf(ageTxt.getText().toString());
        String name = nameTxt.getText().toString();
        intent.putExtra("name",name);
        intent.putExtra("age", age);
        startActivity(intent);
    }
}
