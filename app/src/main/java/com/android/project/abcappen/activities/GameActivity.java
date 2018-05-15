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
    private Button nextButton;
    private Sounds sounds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        sounds = new Sounds(getApplicationContext());
        paintView = (PaintView) findViewById(R.id.paintView);
        nextButton = (Button) findViewById(R.id.nextBtn);

        nextButton.setVisibility(View.INVISIBLE);

        paintView.getBooleanVariable().setListener(new BooleanVariable.ChangeListener() {
            @Override
            public void onChange() {

                nextButton.setVisibility(View.VISIBLE);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                paintView.nextChar();
                paintView.clear();
                nextButton.setVisibility(View.INVISIBLE);
                sounds.playPopSound();
            }
        });

    }
}
