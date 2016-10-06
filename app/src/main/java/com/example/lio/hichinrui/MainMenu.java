package com.example.lio.hichinrui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void nextPage(View v) {
        Class page;
        switch (v.getId()) {
            case R.id.button_text:
                page = Text.class;
                break;
            case R.id.button_buttons:
                page = Buttons.class;
                break;
            case R.id.button_pictures:
                page = Pictures.class;
                break;
            case R.id.button_videos:
                page = Videos.class;
                break;
            default:
                throw new RuntimeException("Unknown button ID");
        }
        Intent intent = new Intent(this, page);
        startActivity(intent);
    }
}
