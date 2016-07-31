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
public class rotate3 extends Activity implements Animation.AnimationListener{


    Button btnStart;
    Button kakaotalk ,facebook ,youtube ,playstore ,option;
    // Animation
    Animation animFadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaur);
        btnStart = (Button)findViewById(R.id.gotofoxlauncher);
        kakaotalk = (Button)findViewById(R.id.kakaotalk);
        facebook = (Button)findViewById(R.id.facebook);
        youtube = (Button)findViewById(R.id.youtube);
        playstore = (Button)findViewById(R.id.playstore);
        option = (Button)findViewById(R.id.option);
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
        kakaotalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.kakao.talk");
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(intent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });
        playstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.android.vending");
                startActivity(intent);
            }
        });
        option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.android.settings");
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
            Intent intent = new Intent(rotate3.this,rotate.class);
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

