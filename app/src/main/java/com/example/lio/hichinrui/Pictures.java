package com.example.lio.hichinrui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import java.io.File;

public class Pictures extends AppCompatActivity {

    // TODO can this be iterated?
    int images[] = {R.drawable.lion1, R.drawable.lion2, R.drawable.lion3, R.drawable.lion4, R.drawable.lion5, R.drawable.lion6,R.drawable.lion7, R.drawable.lion8, R.drawable.lion9, R.drawable.lion_yes, R.drawable.lion_maybe, R.drawable.lion_no};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        GridView simpleGrid = (GridView) findViewById(R.id.GridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), images);
        simpleGrid.setAdapter(customAdapter);
    }
}

