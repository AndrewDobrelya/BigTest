package com.example.bigtest.ex_005_activity_return_result;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bigtest.R;

public class UserActivity extends Activity {

   public TextView nameTxt;
    public TextView langTxt;

    @Override
    public void onCreate(@Nullable Bundle savedInstance){
        super.onCreate(savedInstance);

        setContentView(R.layout.ex005_user_layout);

        langTxt = findViewById(R.id.ex005_2);
        langTxt.setText("");
    }

    public void settings(View view){
        boolean isName = view.getId() == R.id.ex005_name_button;
        Intent intent = (isName) ? new Intent(this, NameActivity.class) : new Intent(this, LanguageActivity.class);
        int result = (isName) ? RequestCode.NAME: RequestCode.LANGUAGE;
        startActivityForResult(intent,result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode == RESULT_OK){
        switch (requestCode){
            case RequestCode.NAME:

           String name = data.getStringExtra("name");
           Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
//         nameTxt.setText(name);
                break;
            case RequestCode.LANGUAGE:
                String language = data.getStringExtra("lang");
                Toast.makeText(this,language,Toast.LENGTH_SHORT).show();
                langTxt.setText(language);
                break;
        }
        }
        else
            Toast.makeText(this,"Error get data", Toast.LENGTH_SHORT).show();
    }



}

