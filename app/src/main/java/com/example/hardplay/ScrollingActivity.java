package com.example.hardplay;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.media.MediaBrowserCompatUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


import java.io.IOException;

public class ScrollingActivity extends AppCompatActivity {

    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        Button b = (Button) findViewById(R.id.button_play1);
        Button b2 = (Button) findViewById(R.id.button_play2);
        Button b3 = (Button) findViewById(R.id.button_play3);
        Button b4 = (Button) findViewById(R.id.button_play4);
        Button b5 = (Button) findViewById(R.id.button_play5);
        Button b6 = (Button) findViewById(R.id.button_play6);
        Button b7 = (Button) findViewById(R.id.button_play7);
        Button b8 = (Button) findViewById(R.id.button_play8);
        Button b9 = (Button) findViewById(R.id.button_play9);
        Button b10 = (Button) findViewById(R.id.button_play10);
        Button b11 = (Button) findViewById(R.id.button_play11);
        Button b12 = (Button) findViewById(R.id.button_play12);
        Button b13 = (Button) findViewById(R.id.button_play13);
        Button b14 = (Button) findViewById(R.id.button_play14);
        Button b15 = (Button) findViewById(R.id.button_play15);
        Button b16 = (Button) findViewById(R.id.button_play16);
        Button b17 = (Button) findViewById(R.id.button_play17);
        Button b18 = (Button) findViewById(R.id.button_play18);
        Button b19 = (Button) findViewById(R.id.button_play19);
        Button b20 = (Button) findViewById(R.id.button_play20);
        Button b21 = (Button) findViewById(R.id.button_play21);
        Button b22 = (Button) findViewById(R.id.button_play22);
        Button b23 = (Button) findViewById(R.id.button_play23);
        Button b24 = (Button) findViewById(R.id.button_play24);
        Button b25 = (Button) findViewById(R.id.button_play25);
        Button b26 = (Button) findViewById(R.id.button_play26);

        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                    mp = MediaPlayer.create(ScrollingActivity.this, R.raw.obidno2);
                    mp.start();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.nikakogo_prazdnika);
                mp.start();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.babi);
                mp.start();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.blagodat);
                mp.start();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.boje);
                mp.start();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.bund);
                mp.start();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.doebavsya);
                mp.start();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.droteri);
                mp.start();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.eggs);
                mp.start();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.grabyat);
                mp.start();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.ispugalis);
                mp.start();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.izvinis);
                mp.start();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.kaktak);
                mp.start();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.lev);
                mp.start();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.loh);
                mp.start();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.mozgi);
                mp.start();
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.nepoluchaetsya);
                mp.start();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.oba);
                mp.start();
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.obidno2);
                mp.start();
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.papavsya);
                mp.start();
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.parapa);
                mp.start();
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.pei);
                mp.start();
            }
        });
        b23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.shonado);
                mp.start();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.skaji);
                mp.start();
            }
        });
        b25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.vo);
                mp.start();
            }
        });
        b26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                stopPlaying();
                mp = MediaPlayer.create(ScrollingActivity.this, R.raw.vstan_i_idi);
                mp.start();
            }
        });


    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    public void stop(View view){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}