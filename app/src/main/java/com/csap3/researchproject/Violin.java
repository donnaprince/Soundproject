package com.csap3.researchproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Violin extends AppCompatActivity {

    //Declare variables
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_violin);



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

}
