package com.android.project.abcappen.activities;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.project.abcappen.R;
import com.android.project.abcappen.data.ProfileDatabaseHelper;
import com.android.project.abcappen.services.BackgroundMusicService;
import com.android.project.abcappen.services.Sounds;
import com.android.project.abcappen.shared.SharedPrefManager;

public class ProfileActivity extends AppCompatActivity {
    private ProfileDatabaseHelper profileDatabaseHelper;
    private TextView tvName;
    private TextView tvWritingStats;
    private TextView tvReadingStats;
    private ImageView imageViewAnim;
    AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageViewAnim = findViewById(R.id.imageView);
        if (imageViewAnim==null)throw new AssertionError();
        imageViewAnim.setBackgroundResource(R.drawable.animation_abc);
        anim = (AnimationDrawable) imageViewAnim.getBackground();
        anim.start();

        profileDatabaseHelper = new ProfileDatabaseHelper(getApplicationContext());

        tvName = findViewById(R.id.tv_name);
        tvWritingStats = findViewById(R.id.tv_writing_stats);

        Intent intent = getIntent();
        tvName.setText(intent.getStringExtra("name"));

        String numCompletedLetters = String.valueOf(profileDatabaseHelper.getNumberOfCompletedLetters(SharedPrefManager.getInstance(getApplicationContext()).getId()));
        String[] letters = getResources().getStringArray(R.array.letters);
        tvWritingStats.setText(numCompletedLetters + "/" + letters.length);
    }

    public void showDetailedStatistics(View v) {
        Sounds sounds = new Sounds(this);
        sounds.playPopSound();
        startActivity(new Intent(getApplicationContext(), StatisticsActivity.class));
    }

    public void playWritingGame(View v) {
        Sounds sounds = new Sounds(this);
        sounds.playPopSound();
        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        stopService(backgroundMusic);
        startActivity(new Intent(getApplicationContext(), GameActivity.class));
    }

    public void playSpeechGame(View v){
        Sounds sounds = new Sounds(this);
        sounds.playPopSound();
        Intent backgroundMusic = new Intent(this,BackgroundMusicService.class);
        stopService(backgroundMusic);
        startActivity(new Intent(getApplicationContext(), SpeechActivity.class));
    }
}
