package com.android.project.abcappen.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.project.abcappen.R;
import com.android.project.abcappen.data.ProfileDatabaseHelper;
import com.android.project.abcappen.services.Sounds;

public class ProfileActivity extends AppCompatActivity {
    private ProfileDatabaseHelper profileDatabaseHelper;
    private TextView tvName;
    private TextView tvWritingStats;
    private TextView tvReadingStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileDatabaseHelper = new ProfileDatabaseHelper(getApplicationContext());

        tvName = findViewById(R.id.tv_name);
        tvWritingStats = findViewById(R.id.tv_writing_stats);
        tvReadingStats = findViewById(R.id.tv_reading_stats);

        Intent intent = getIntent();
        tvName.setText(intent.getStringExtra("name"));


    }

    public void playWritingGame(View v) {
        Sounds sounds = new Sounds(this);
        sounds.playPopSound();
        startActivity(new Intent(getApplicationContext(), GameActivity.class));
    }
}
