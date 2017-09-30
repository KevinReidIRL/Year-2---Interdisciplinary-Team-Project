package com.example.conorsheridan.hyf;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class IntroActivity extends Activity {

    MediaPlayer mediaPlayer;

    Button b1;

    Typeface din;







    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

     
        
//        
//      mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
//
//       mediaPlayer.setLooping(true);
//        mediaPlayer.start();


        b1 = (Button) findViewById(R.id.button);

        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");

        b1.setTypeface(din);
    }




    public void sendMain(View view){
        Intent startNewActivity = new Intent(this,MainActivity.class);
        startActivity(startNewActivity);
    }


}