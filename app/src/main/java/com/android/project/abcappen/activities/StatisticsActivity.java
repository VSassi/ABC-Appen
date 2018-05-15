package com.android.project.abcappen.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.project.abcappen.R;
import com.android.project.abcappen.data.LetterProgress;
import com.android.project.abcappen.data.ProfileDatabaseHelper;
import com.android.project.abcappen.shared.SharedPrefManager;

import java.util.ArrayList;

public class StatisticsActivity extends AppCompatActivity {
    private ProfileDatabaseHelper profileDatabaseHelper;
    private ArrayList<LetterProgress> writingProgress;
    private String[] letters;

    private TextView tvName, tvLetter, tvTimesCompleted, tvCompletionTime, tvAccuracy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        profileDatabaseHelper = new ProfileDatabaseHelper(getApplicationContext());
        String profileId = SharedPrefManager.getInstance(getApplicationContext()).getId();
        writingProgress = profileDatabaseHelper.getWritingProgress(profileId);

        tvName = findViewById(R.id.tv_name);
        tvName.setText(profileDatabaseHelper.getProfile(Integer.parseInt(profileId)));

        tvLetter = findViewById(R.id.tv_letter);
        tvTimesCompleted = findViewById(R.id.tv_times_completed);
        tvCompletionTime = findViewById(R.id.tv_completion_time);
        tvAccuracy = findViewById(R.id.tv_accuracy);

        LetterProgress letterProgress = writingProgress.get(0);
        tvLetter.setText(letterProgress.getLetter());
        tvTimesCompleted.setText(letterProgress.getTimesCompleted());
        double completionTime = Double.parseDouble(letterProgress.getCompletionTime())/1000;
        tvCompletionTime.setText(String.valueOf(completionTime));
        tvAccuracy.setText(letterProgress.getAccuracy());
    }
}
