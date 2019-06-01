package com.example.bigtest.ex_004_toast_and_activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bigtest.R;

import java.util.List;

public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText login;
    private EditText password;
    private CheckBox checkBox;
    private TextView nameTextView;
    private EditText nameEditText;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex004_login_activity);
        login = findViewById(R.id.login_edit_text);
        password = findViewById(R.id.password_edit_text);
        checkBox = findViewById(R.id.checkBox);
        button = findViewById(R.id.cofirm_login_button);

        nameTextView = findViewById(R.id.registration_text_view);
        nameEditText = findViewById(R.id.registration_edit_text);
        checkBox.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(checkBox.isChecked()){
        nameEditText.setVisibility(View.VISIBLE);
        nameTextView.setVisibility(View.VISIBLE);
            button.setText("Register");
        }
        else{
            nameTextView.setVisibility(View.GONE);
            nameEditText.setVisibility(View.GONE);
            button.setText("Login");
        }


    }

    public void Click(View view) {
        String loginTxt = login.getText().toString();
        String passowrdTxt = password.getText().toString();
        if(checkBox.isChecked()){
            String nameTxt = nameEditText.getText().toString();
            register(loginTxt, passowrdTxt,nameTxt);
        }
        else {
            login(loginTxt,passowrdTxt);
        }
    }

    private void login(String loginTxt, String passwordTxt) {
        User user = new User(loginTxt,passwordTxt,null);
        List<User> users = User.getAllUsers();
        if(users.contains(user)){
        User currentUser = getUser(user.getLogin(),users);
        checkPassword(passwordTxt, currentUser);
        }
        else
            Toast.makeText(this,"User not registrated", Toast.LENGTH_LONG).show();
    }

    private void register(String loginTxt, String passowrdTxt, String nameTxt) {
        User user = new User(loginTxt,passowrdTxt,nameTxt);
        List<User> users = User.getAllUsers();
        if(!users.contains(user)){
            User.getAllUsers().add(user);
            goToUserAtivity("Registration succsessfull "+user.getName());
        }
        else
            Toast.makeText(this,"User is already exist",Toast.LENGTH_LONG).show();

    }

    private void goToUserAtivity(String message){
        Intent intent = new Intent(this, UserActivity.class);
        intent.putExtra("message",message);
        startActivity(intent);
    }

    private User getUser(String login, List<User> users){
        for (User user: users){
            if(user.getLogin().equals(login))
                return user;
        }
        return null;
    }

    private void checkPassword(String password , User user){
      if(password.equals(user.getPassword()))
          goToUserAtivity("Hello" + user.getName());
    else
        Toast.makeText(this,"Incorrect password",Toast.LENGTH_LONG).show();
    }

}
