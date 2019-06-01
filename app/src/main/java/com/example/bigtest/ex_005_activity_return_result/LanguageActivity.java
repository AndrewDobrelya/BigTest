package com.example.bigtest.ex_005_activity_return_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bigtest.R;

public class LanguageActivity extends Activity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex005_language_layout);

    }

    public void choose(View view){
        Button button = (Button) view;
        String language = button.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("lang",language);
        setResult(RESULT_OK, intent);
        finish();
    }
}
