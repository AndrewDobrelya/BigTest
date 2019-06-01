package com.example.bigtest.ex_006_notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import com.example.bigtest.R;

public class NotifiationActivity extends Activity  {

    private final int NOTIFICATION_ID = 127;
    public static final String ANDROID_CHANNEL_ID = "ccom.example.bigtest.ANDROID";
    private NotificationManager manager;
    private Button showNotifacation;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.ex006_notification_mane);
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        showNotifacation = (Button) findViewById(R.id.notifiation_button);
        showNotifacation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                NotificationCompat.Builder builder =
//                        new NotificationCompat.Builder(NotifiationActivity.this)
//                                .setSmallIcon(R.mipmap.ic_launcher)
//                                .setContentTitle("Title")
//                                .setContentText("Notification text");
//
//                Notification notification = builder.build();
//
//                NotificationManager notificationManager =
//                        (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//                    NotificationChannel channel = new NotificationChannel(ANDROID_CHANNEL_ID, "My channel",
//                            NotificationManager.IMPORTANCE_HIGH);
//                    channel.setDescription("My channel description");
//                    channel.enableLights(true);
//                    channel.setLightColor(Color.RED);
//                    channel.enableVibration(false);
//                    notificationManager.createNotificationChannel(channel);
//                }
//                notificationManager.notify(1, notification);
                Notification.Builder builder = new Notification.Builder(getApplicationContext());

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);

                builder.setContentIntent(pendingIntent)
                        .setSmallIcon(R.drawable.bulbasaur)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bulbasaur))
                        .setTicker("New notification")
                        .setWhen(System.currentTimeMillis())
                        .setAutoCancel(true)
                        .setContentTitle("Notification")
                        .setContentText("Press this!!!");
                Notification notification = builder.build();
                manager.notify(NOTIFICATION_ID, notification);
            }
        });

    }


}

