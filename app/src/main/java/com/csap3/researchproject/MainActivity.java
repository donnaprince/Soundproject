package com.csap3.researchproject;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.SoundEffectConstants;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;




public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    SoundPool mysound;
    int explodeId1; //assign id for note A
    int explodeId2; //assign id for note B
    int explodeId3; //assign id for note C
    int explodeId4; //assign id for note D
    int explodeId5; //assign id for note E
    int explodeId6; //assign id for note F
    int explodeId7; //assign id for note G



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = findViewById(R.id.toolbar);   //DONNA -- COMMENTED THIS OUT AS THIS WAS GIVING ME ERROR
        //setSupportActionBar(toolbar);    //DONNA -- COMMENTED THIS OUT AS THIS WAS GIVING ME ERROR


        //assign attributes to a variable
        AudioAttributes aa = new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).setUsage(AudioAttributes.USAGE_GAME).build();
        //assign soundpool to a variable
        mysound = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(aa).build();
        explodeId1 = mysound.load(this,R.raw.pianoa,1);
        explodeId2 = mysound.load(this,R.raw.pianob,1);
        explodeId3 = mysound.load(this,R.raw.pianoc,1);
        explodeId4 = mysound.load(this,R.raw.pianod,1);
        explodeId5 = mysound.load(this,R.raw.pianoe,1);
        explodeId6 = mysound.load(this,R.raw.pianof,1);
        explodeId7 = mysound.load(this,R.raw.pianog,1);



        //Wire the button to do things.
        //1. Get the button.
        ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
        //2. Set what happens when the user clicks.
        final MediaPlayer mpa = MediaPlayer.create(this, R.raw.pianoa);
        final MediaPlayer mpb = MediaPlayer.create(this, R.raw.pianob);
        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.pianoc);
        final MediaPlayer mpd = MediaPlayer.create(this, R.raw.pianod);
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.pianoe);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.pianof);
        final MediaPlayer mpg = MediaPlayer.create(this, R.raw.pianog);
        //btn.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v)
            //{
            //    mpa.start();
            //}
        //});

        Button playa = (Button) findViewById(R.id.button);
        playa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpa.start();
            }
        });

        Button playb = (Button) findViewById(R.id.button2);
        playb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpb.start();
            }
        });


        Button playc = (Button) findViewById(R.id.button3);
        playc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpc.start();
            }
        });

        Button playd = (Button) findViewById(R.id.button4);
        playd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpd.start();
            }
        });

        Button playe = (Button) findViewById(R.id.button5);
        playe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpe.start();
            }
        });

        Button playf = (Button) findViewById(R.id.button6);
        playf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpf.start();
            }
        });

        Button playg = (Button) findViewById(R.id.button7);
        playg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                mpg.start();
            }
        });



        //btn.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {
             //   Log.i("MyApp", "This is a log message!");
            //}
        //});

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.pianoa);
        //mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    public void PlaySoundA(View view) {
        //play note A in a loop 10 times
        mysound.play(explodeId1,1,1,0,10,1);
    }

    public void PlaySoundB(View view) {
        //play note B in a loop 10 times
        mysound.play(explodeId2,1,1,0,10,1);
    }

    public void PlaySoundC(View view) {
        //play note C in a loop 10 times
        mysound.play(explodeId3,1,1,0,10,1);
    }

    public void PlaySoundD(View view)
    //play note D in a loop 10 times
    {
        mysound.play(explodeId4,1,1,0,10,1);
    }
    public void PlaySoundE(View view) {
        //play note E in a loop 10 times
        mysound.play(explodeId5,1,1,0,10,1);
    }

    public void PlaySoundF(View view) {
        //play note F in a loop 10 times
        mysound.play(explodeId6,1,1,0,10,1);
    }

    public void PlaySoundG(View view) {
        //play note G in a loop 10 times
        mysound.play(explodeId7,1,1,0,10,1);
    }
    public void PauseSound(View view) {
        mysound.pause(explodeId1);//hit pause button to Pause note A when its playing
        mysound.pause(explodeId2);//hit pause button to Pause note B when its playing
        mysound.pause(explodeId3);//hit pause button to Pause note C when its playing
        mysound.pause(explodeId4);//hit pause button to Pause note D when its playing
        mysound.pause(explodeId5);//hit pause button to Pause note E when its playing
        mysound.pause(explodeId6);//hit pause button to Pause note F when its playing
        mysound.pause(explodeId7);//hit pause button to Pause note G when its playing

    }

}

