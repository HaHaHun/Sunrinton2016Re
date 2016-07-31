package com.example.ksh.juzzlauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ksh on 2016-07-24.
 */
public class rotate2 extends Activity implements Animation.AnimationListener{


    Button btnStart;
    Button music ,pencil ,record ,calendar;
    // Animation
    Animation animFadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear);
        btnStart = (Button)findViewById(R.id.gotodinosaurlauncher);
        music = (Button)findViewById(R.id.music);
        pencil = (Button)findViewById(R.id.memo);
        record = (Button)findViewById(R.id.record);
        calendar = (Button)findViewById(R.id.calendar);
        // load the animation
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        animFadein.setAnimationListener(this);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnStart.setVisibility(View.VISIBLE);
                btnStart.startAnimation(animFadein);
//
            }
        });
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.sec.android.app.music");
                startActivity(intent);
            }
        });
        pencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.samsung.android.app.memo");
                startActivity(intent);
            }
        });
        record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.sec.android.app.voicenote");
                startActivity(intent);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.android.calendar");
                startActivity(intent);
            }
        });
    }


    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        // check for fade in animation
        if (animation == animFadein) {
            Toast.makeText(getApplicationContext(), "Animation Stopped",
                    Toast.LENGTH_SHORT).show();
            finish();
            Intent intent = new Intent(rotate2.this,rotate3.class);
            startActivity(intent);
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // Animation is repeating
    }

    @Override
    public void onAnimationStart(Animation animation) {
        // Animation started
    }

}
