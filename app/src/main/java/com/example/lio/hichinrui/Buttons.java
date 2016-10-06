package com.example.lio.hichinrui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
import static com.example.lio.hichinrui.R.id.mood;

public class Buttons extends AppCompatActivity {

    boolean isLightOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
    }

    public void changeColor(View v) {
        Random rnd = new Random();
        int new_color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        v.setBackgroundColor(new_color);
    }

    public void switchLights(View v) {
        if (isLightOn) {
            findViewById(R.id.activity_buttons).setBackgroundColor(Color.BLACK);
            isLightOn = false;
        }
        else {
            findViewById(R.id.activity_buttons).setBackgroundColor(Color.WHITE);
            isLightOn = true;
        }
    }

    public void changeMood(View v) {
        int image;
        switch (v.getId()) {
            case R.id.radio1:
                image = R.drawable.lion_yes;
                break;
            case R.id.radio2:
                image = R.drawable.lion_no;
                break;
            case R.id.radio3:
                image = R.drawable.lion_maybe;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
        ImageView moodImage = (ImageView) findViewById(mood);
        moodImage.setImageResource(image);
    }
}
