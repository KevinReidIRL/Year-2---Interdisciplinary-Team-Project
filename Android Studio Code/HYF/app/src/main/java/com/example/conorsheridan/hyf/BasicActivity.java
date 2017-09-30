package com.example.conorsheridan.hyf;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class BasicActivity extends Activity {

    Button b1;
   
    Typeface din;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        
        b1 = (Button) findViewById(R.id.button7);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        b1.setTypeface(din);
    }


    public void sendMap(View view){
        Intent startNewActivity = new Intent(this,MapsActivity.class);
        startActivity(startNewActivity);
    }
}
