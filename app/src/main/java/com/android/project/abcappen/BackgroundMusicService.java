package com.android.project.abcappen;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class BackgroundMusicService extends Service {

    private static final String TAG = null;
    MediaPlayer backgroundPlayer;
    int lenght;
    public IBinder onBind(Intent arg0){
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        backgroundPlayer = MediaPlayer.create(this, R.raw.trundle_loop);
        backgroundPlayer.setLooping(true);
        backgroundPlayer.setVolume(100, 100);

    }
    public  int onStartCommand(Intent intent,int flags,int startId){

        backgroundPlayer.start();
        return START_STICKY;
    }
    public IBinder onUnBind(Intent arg0){
        return null;
    }

    public void onStop(){
        backgroundPlayer.stop();
        backgroundPlayer.release();
        backgroundPlayer = null;

    }
    public void onPause(){

        backgroundPlayer.pause();
        backgroundPlayer.getCurrentPosition();

    }
    public void resumePlay(){

        backgroundPlayer.seekTo(lenght);
        backgroundPlayer.start();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        backgroundPlayer.stop();
        backgroundPlayer.release();

    }

    @Override
    public void onLowMemory() {

    }
}

