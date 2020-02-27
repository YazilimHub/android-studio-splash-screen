package com.yazilimhub.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img =(ImageView) findViewById(R.id.img);
        text =(TextView) findViewById(R.id.text);

        Animation manim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        text.startAnimation(manim);
        img.startAnimation(manim);

        final Intent i = new Intent(this,AnaSayfa.class);

        Thread timer = new Thread(){

            public  void  run() {

                try {
                    sleep(4000);
                } catch (InterruptedException e ){

                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }

            }


        };
        timer.start();
    }
}
