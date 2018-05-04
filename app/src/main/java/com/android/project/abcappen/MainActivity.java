package com.android.project.abcappen;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Sounds sounds;


    private Button button;
    private ConstraintLayout top,bot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top = findViewById(R.id.constraintLayout);
        bot = findViewById(R.id.constraintLayout2);

        sounds = new Sounds(this);


        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        startService(backgroundMusic);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.playPopSound();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        stopService(backgroundMusic);

    }
}
