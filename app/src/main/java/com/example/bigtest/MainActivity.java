package com.example.bigtest;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import com.example.bigtest.ex_001_simple_activity.SimpleActivity;
import com.example.bigtest.ex_002_hello_button.HelloButtonActivity;
import com.example.bigtest.ex_003_send_data_simple.MainNameActivity;
import com.example.bigtest.ex_004_toast_and_activity.LoginActivity;
import com.example.bigtest.ex_005_activity_return_result.UserActivity;
import com.example.bigtest.ex_006_notification.NotifiationActivity;
import com.example.bigtest.ex_007_simple_fragment.FragmentSimpleActivity;
import com.example.bigtest.ex_008_two_fragment.TwoFragmentMainActivity;
import com.example.bigtest.ex_009_interface_fragment.InterfaceFragmentActivity;
import com.example.bigtest.ex_010_simple_interface1.Intarface1Activity;
import com.example.bigtest.ex_011_simple_interface2.Interface2Activity;


public class MainActivity extends Activity {

    private Button button;
    Intent intent ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

//        NotificationCompat.Builder builder =
//                new NotificationCompat.Builder(this)
//                        .setSmallIcon(R.drawable.bulbasaur)
//                        .setContentTitle("Title")
//                        .setContentText("Notification text");
//
//        Notification notification = builder.build();
//
//        NotificationManager notificationManager =
//                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        notificationManager.notify(1, notification);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button : intent= new Intent(MainActivity.this,  SimpleActivity.class);

                break;
            case R.id.button2 : intent = new Intent(MainActivity.this, HelloButtonActivity.class);
                break;
            case R.id.button3 : intent = new Intent(MainActivity.this, MainNameActivity.class);
                break;
            case R.id.button4 : intent = new Intent(MainActivity.this, LoginActivity.class);
                break;
            case R.id.button5 : intent = new Intent(this, UserActivity.class);
                break;
            case R.id.button6 : intent = new Intent(getApplicationContext(), NotifiationActivity.class);
                break;
            case R.id.button7 : intent= new Intent(getApplicationContext(), FragmentSimpleActivity.class);
                break;
            case R.id.button8 : intent = new Intent(getApplicationContext(), TwoFragmentMainActivity.class);
                break;
            case R.id.button9 : intent = new Intent(this, InterfaceFragmentActivity.class);
                break;
            case R.id.button10: intent = new Intent(getApplicationContext(), Intarface1Activity.class);
                break;
            case R.id.button11: intent = new Intent(this, Interface2Activity.class);


        }
        startActivity(intent);
    }
}
