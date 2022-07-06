package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Get the click type of the button in mainactivity: process different events according to different types
        int action = intent.getIntExtra("music",1);
        stopMusic();
        playMusic(action);
        return super.onStartCommand(intent, flags, startId);
    }
    /**
     *Play music
     */
    public void playMusic(int i) {
        if (player == null ) {
            if(i == 1)
            player = MediaPlayer.create(this, R.raw.one);
            if(i == 2)
                player = MediaPlayer.create(this, R.raw.two);
            if(i == 3)
                player = MediaPlayer.create(this, R.raw.three);
            if(i == 4)
                player = MediaPlayer.create(this, R.raw.four);
        }
        player.start();
        player.setLooping(false);
    }
    /**
     *Stop playing
     */
    public void stopMusic() {
        if (player != null) {
            player.stop();
            player.reset();// Reset
            player.release();// release
            player = null;
        }
    }
    @Override
    public void onDestroy() {
        player.stop();
        super.onDestroy();
        //Stop music before the service dies
        stopMusic();
    }
}
