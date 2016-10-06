package com.example.lio.hichinrui;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.lio.hichinrui.R.id.videoview;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        VideoView videoView = (VideoView) findViewById(videoview);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid1));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
    }
}
