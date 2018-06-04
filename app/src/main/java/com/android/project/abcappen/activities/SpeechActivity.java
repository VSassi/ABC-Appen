package com.android.project.abcappen.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.project.abcappen.R;
import com.android.project.abcappen.services.Sounds;
import com.android.project.abcappen.words.WordImage;

import java.util.ArrayList;
import java.util.Locale;

public class SpeechActivity extends AppCompatActivity {

    private TextToSpeech tts;

    private TextView resultText, wordText;

    private WordImage[] wordImages;
    private ImageView wordImage;

    private Sounds sounds;

    private int wordIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speech);
        resultText = findViewById(R.id.resultView);
        wordText = findViewById(R.id.wordView);
        wordImage = findViewById(R.id.wordImageView);
        wordImages = new WordImage[5];
        initWords();
        wordImage.setImageResource(wordImages[wordIndex].getResources());

        tts = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = tts.setLanguage(Locale.getDefault());
                    if (result == TextToSpeech.LANG_MISSING_DATA) {
                        Toast.makeText(getApplicationContext(), "Sorry, your device does not support speech", Toast.LENGTH_SHORT).show();
                    } else {
                        //method
                        //textToSpeech(words[wordIndex]);
                    }
                } else {
                    Log.e("TextToSpeech", "Language not supported");
                }
            }
        });

        wordText.setText(wordImages[wordIndex].getName());

        wordImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech(wordImages[wordIndex].getName());
            }
        });

    }

/*
TODO: REMOVE TEXT TO SPEECH RESOURCES WHEN PAUSED
    @Override
    protected void onPause() {

        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onPause();
    }
    */

    public void onRecordBtnClick(View view) {
        if (view.getId() == R.id.recordBtn) {
          promptSpeechInput();
        }
    }

    private void textToSpeech(String text) {
        if (text == null || "".equals(text)) {
            //text = "Content not available";
            tts.speak("Ordet finns inte", TextToSpeech.QUEUE_FLUSH, null);
        } else {
            tts.speak(text, TextToSpeech.QUEUE_ADD, null);
        }
    }


    public void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Prata in i micken");

        try {
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(getApplicationContext(), "Sorry, your device does not support speech", Toast.LENGTH_SHORT).show();
        }

    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        switch (requestCode) {
            case 100:
                if (resultCode == RESULT_OK && intent != null) {
                    ArrayList<String> result = intent.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    resultText.setText(result.get(0));
                    if (result.get(0).toLowerCase().trim().equals(wordImages[wordIndex].getName().toLowerCase().trim())) {
                        Toast.makeText(getApplicationContext(), wordImages[wordIndex].getName() + " avklarat!", Toast.LENGTH_SHORT).show();
                        wordIndex++;
                        if (wordIndex >= wordImages.length) {
                            wordIndex = 0;
                        }
                        wordImage.setImageResource(wordImages[wordIndex].getResources());
                        wordText.setText(wordImages[wordIndex].getName());
                    }
                }
                break;
        }
    }

    public void initWords(){
        wordImages[0] = new WordImage("Får", R.drawable.sheep);
        wordImages[1] = new WordImage("Krokodil", R.drawable.crocodile);
        wordImages[2] = new WordImage("Hund", R.drawable.dog);
        wordImages[3] = new WordImage("Apa", R.drawable.monkey);
        wordImages[4] = new WordImage("Katt", R.drawable.cat);
    }
}
