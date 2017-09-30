package com.example.conorsheridan.hyf;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    Button b1;
    
    TextView t1;

    Typeface din;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        t1.setTypeface(din);
        
        t1 = (TextView) findViewById(R.id.textView2);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        t1.setTypeface(din);
        
        b1 = (Button) findViewById(R.id.button2);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        b1.setTypeface(din);
        
        b1 = (Button) findViewById(R.id.button3);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        b1.setTypeface(din);
        
        b1 = (Button) findViewById(R.id.button4);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        b1.setTypeface(din);
        
        b1 = (Button) findViewById(R.id.button5);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        b1.setTypeface(din);
        
        b1 = (Button) findViewById(R.id.button6);
        din = Typeface.createFromAsset(getAssets(), "fonts/din.ttf");
        b1.setTypeface(din);
    }

    public void sendBasic(View view){
        Intent startNewActivity = new Intent(this,BasicActivity.class);
        startActivity(startNewActivity);
    }
}
