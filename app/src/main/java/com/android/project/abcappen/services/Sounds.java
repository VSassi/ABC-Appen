package com.android.project.abcappen.services;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

import com.android.project.abcappen.R;

public class Sounds {

    private static SoundPool soundPool;
    private static int pop;

    public Sounds(Context context){

        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        pop = soundPool.load(context, R.raw.pop_sound,1);
    }

    public void playPopSound(){
        soundPool.play(pop,1.0f,1.0f,1,0,2.0f);
    }
}
