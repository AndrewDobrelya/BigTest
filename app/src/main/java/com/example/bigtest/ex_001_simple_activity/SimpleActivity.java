package com.example.bigtest.ex_001_simple_activity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bigtest.R;

public class SimpleActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
        TextView label = new TextView(this);
        label.setText(R.string.simple_text);
        label.setTextSize(30);
        label.setGravity(Gravity.CENTER_HORIZONTAL);

        ImageView pic = new ImageView(this);
        pic.setImageResource(R.drawable.bulbasaur);
        pic.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
        pic.setAdjustViewBounds(true);
        pic.setScaleType(ImageView.ScaleType.FIT_XY);
//        pic.setMaxHeight(250);
//        pic.setMaxWidth(250);


        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT));
        ll.setGravity(Gravity.CENTER);
        ll.addView(label);
        ll.addView(pic);
        setContentView(ll);

    }
}
