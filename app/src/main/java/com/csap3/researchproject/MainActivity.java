package com.csap3.researchproject;

import android.content.Intent;
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

/*

commit e319f10479c1e7533d795d9d2963851467fb4e42 (HEAD -> master, origin/master, origin/HEAD)
Author: Donna <donnagraceprince@gmail.com>
Date:   Mon Jan 20 02:11:42 2020 -0800


commit 1db18b4c7455b7036c4e408b9422848c346a7591
Author: Donna <donnagraceprince@gmail.com>
Date:   Mon Jan 20 02:11:34 2020 -0800


commit 801cc4c74a990d1544de34424cbfbbbe27b86e26
Author: Donna <donnagraceprince@gmail.com>
Date:   Mon Jan 20 02:11:25 2020 -0800


commit 28ef342cf42e46ac82a9a8dd180f7d17b402b373
Author: Donna <donnagraceprince@gmail.com>
Date:   Mon Jan 20 02:11:14 2020 -0800


commit 0f49105ad3280e08947f31f774ed876242c78f3f
Author: unknown <akamaiwong@gmail.com>
Date:   Sun Jan 19 19:43:52 2020 -0800


commit 1768f022210f90cf1b3f7ff340ba7965b9c631d2
Author: unknown <akamaiwong@gmail.com>
Date:   Sun Jan 19 16:44:09 2020 -0800


commit ba00c203b03ff0cb0a7a23fa54b06e719be67fad
Author: unknown <akamaiwong@gmail.com>
Date:   Sun Jan 19 16:32:28 2020 -0800



commit 53938e0aa9d3e03176bb1d770ce0d60cf4d37ab6
Author: unknown <akamaiwong@gmail.com>
Date:   Sun Jan 19 16:05:50 2020 -0800


commit bde62f4e0e6561dfea0208f13e58d2c8aa13d808
Author: Donna <donnagraceprince@gmail.com>
Date:   Sun Jan 19 13:03:39 2020 -0800

 */
public class MainActivity extends AppCompatActivity {

    //Declare variables
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



        //Assign variables to each sound so the java file can identify the sounds to play.
        final MediaPlayer mpa = MediaPlayer.create(this, R.raw.pianoa);
        final MediaPlayer mpb = MediaPlayer.create(this, R.raw.pianob);
        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.pianoc);
        final MediaPlayer mpd = MediaPlayer.create(this, R.raw.pianod);
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.pianoe);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.pianof);
        final MediaPlayer mpg = MediaPlayer.create(this, R.raw.pianog);



        //Link each button to a sound to be played when pressed.
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


        //Switch screens when this button is pressed.
        Button switchscreen = (Button) findViewById(R.id.button23);
        switchscreen.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Violin.class);
                startActivityForResult(myIntent, 0);
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

