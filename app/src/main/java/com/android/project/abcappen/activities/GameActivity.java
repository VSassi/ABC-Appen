package com.android.project.abcappen.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.project.abcappen.R;
import com.android.project.abcappen.services.Sounds;
import com.android.project.abcappen.views.PaintView;

public class GameActivity extends AppCompatActivity {

    private PaintView paintView;
    private Button resetButton;
    Sounds sounds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        sounds = new Sounds(getApplicationContext());
        paintView = (PaintView) findViewById(R.id.paintView);
        resetButton = (Button) findViewById(R.id.resetBtn);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintView.clear();
                sounds.playPopSound();
            }
        });
    }
}
