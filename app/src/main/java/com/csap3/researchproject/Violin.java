package com.csap3.researchproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Violin extends AppCompatActivity {

    //Declare variables
    MediaPlayer mediaPlayer;
    SoundPool mysound;
    int violin1; //assign id for note A
    int violin2; //assign id for note B
    int violin3; //assign id for note C
    int violin4; //assign id for note D
    int violin5; //assign id for note E
    int violin6; //assign id for note F
    int violin7; //assign id for note G


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_violin);

        //assign attributes to a variable
        AudioAttributes aa = new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_MUSIC).setUsage(AudioAttributes.USAGE_GAME).build();
        //assign soundpool to a variable
        mysound = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(aa).build();
        violin1 = mysound.load(this,R.raw.violina,1);
        violin2 = mysound.load(this,R.raw.violinb,1);
        violin3 = mysound.load(this,R.raw.violinc,1);
        violin4 = mysound.load(this,R.raw.violind,1);
        violin5 = mysound.load(this,R.raw.violine,1);
        violin6 = mysound.load(this,R.raw.violinf,1);
        violin7 = mysound.load(this,R.raw.violing,1);



        //Assign variables to each sound so the java file can identify the sounds to play.
        final MediaPlayer mpa = MediaPlayer.create(this, R.raw.violina);
        final MediaPlayer mpb = MediaPlayer.create(this, R.raw.violinb);
        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.violinc);
        final MediaPlayer mpd = MediaPlayer.create(this, R.raw.violind);
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.violine);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.violinf);
        final MediaPlayer mpg = MediaPlayer.create(this, R.raw.violing);



        //Link each button to a sound to be played when pressed.
        Button playa = (Button) findViewById(R.id.button9);
        playa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpa.start();
            }
        });


        Button playb = (Button) findViewById(R.id.button17);
        playb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mpb.start();
            }
        });


        Button playc = (Button) findViewById(R.id.button18);
        playc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                mpc.start();
            }
        });

        Button playd = (Button) findViewById(R.id.button19);
        playd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpd.start();
            }
        });

        Button playe = (Button) findViewById(R.id.button20);
        playe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpe.start();
            }
        });

        Button playf = (Button) findViewById(R.id.button21);
        playf.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpf.start();
            }
        });

        Button playg = (Button) findViewById(R.id.button22);
        playg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mpg.start();
            }
        });


    }


    //Reset the sound player for each sound.
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    public void PlayviolinA(View view) {
        //play note A in a loop 10 times
        mysound.play(violin1,1,1,0,10,1);
    }

    public void PlayviolinB(View view) {
        //play note B in a loop 10 times
        mysound.play(violin2,1,1,0,10,1);
    }

    public void PlayviolinC(View view) {
        //play note C in a loop 10 times
        mysound.play(violin3,1,1,0,10,1);
    }

    public void PlayviolinD(View view)
    //play note D in a loop 10 times
    {
        mysound.play(violin4,1,1,0,10,1);
    }
    public void PlayviolinE(View view) {
        //play note E in a loop 10 times
        mysound.play(violin5,1,1,0,10,1);
    }

    public void PlayviolinF(View view) {
        //play note F in a loop 10 times
        mysound.play(violin6,1,1,0,10,1);
    }

    public void PlayviolinG(View view) {
        //play note G in a loop 10 times
        mysound.play(violin7,1,1,0,10,1);
    }
    public void Pauseviolin(View view) {
        mysound.pause(violin1);//hit pause button to Pause note A when its playing
        mysound.pause(violin2);//hit pause button to Pause note B when its playing
        mysound.pause(violin3);//hit pause button to Pause note C when its playing
        mysound.pause(violin4);//hit pause button to Pause note D when its playing
        mysound.pause(violin5);//hit pause button to Pause note E when its playing
        mysound.pause(violin6);//hit pause button to Pause note F when its playing
        mysound.pause(violin7);//hit pause button to Pause note G when its playing

    }

}
