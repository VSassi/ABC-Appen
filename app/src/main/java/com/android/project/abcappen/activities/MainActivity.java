package com.android.project.abcappen.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.project.abcappen.services.BackgroundMusicService;
import com.android.project.abcappen.R;
import com.android.project.abcappen.services.Sounds;


public class MainActivity extends AppCompatActivity {
    private Sounds sounds;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This line is just for test, remove later!!
        startActivity(new Intent(getApplicationContext(), GameActivity.class));


        sounds = new Sounds(this);

        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        startService(backgroundMusic);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sounds.playPopSound();
                startActivity(new Intent(getApplicationContext(), GameActivity.class));
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
