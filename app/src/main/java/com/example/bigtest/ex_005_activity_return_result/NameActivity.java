package com.example.bigtest.ex_005_activity_return_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.example.bigtest.R;

public class NameActivity extends Activity {
    private EditText nameTxt;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex005_name_layout);
        nameTxt = findViewById(R.id.ex005_edit_name_edit_text);
    }

    public void confirm(View view){

        Intent intent = new Intent();
        String name = nameTxt.getText().toString();
        if(name!=null){
        intent.putExtra("name",name);
        setResult(RESULT_OK,intent);}
        else{
            setResult(RESULT_CANCELED,intent);
        }
        finish();
    }
}
