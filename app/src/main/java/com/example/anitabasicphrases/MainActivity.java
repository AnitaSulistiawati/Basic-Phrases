package com.example.anitabasicphrases;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.Q)
    public void said(View view){

    int id = view.getId();

    String ourId = "";

    ourId = view.getResources().getResourceEntryName(id);
    // this is the package Name , we can put it there (com.example.appbasicpharases) but it not safe
    // not safe
    // it's safe
    int resourceId = getResources().getIdentifier(ourId,"raw", getOpPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this,resourceId);

        mediaPlayer.start();
        Log.d("Said",ourId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}