package com.example.ksh.juzzlauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ksh on 2016-07-24.
 */
public class rotate extends Activity implements Animation.AnimationListener{


    Button btnStart;
    Button call ,internet ,howtocall ,message ,camera ,gallery;
    // Animation
    Animation animFadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fox);
        btnStart = (Button)findViewById(R.id.gotobearlauncher);
        call = (Button)findViewById(R.id.call);
        internet = (Button)findViewById(R.id.internet);
        howtocall = (Button)findViewById(R.id.howtocall);
        message = (Button)findViewById(R.id.message);
        camera = (Button)findViewById(R.id.camera);
        gallery = (Button)findViewById(R.id.gallery);
        // load the animation
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        animFadein.setAnimationListener(this);
       btnStart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               btnStart.setVisibility(View.VISIBLE);
               btnStart.startAnimation(animFadein);

            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.android.phone");
                startActivity(intent);
            }
        });
        internet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.sec.android.app.sbrowser");
                startActivity(intent);
            }
        });
        howtocall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.android.contacts");
                startActivity(intent);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.android.mms");
                startActivity(intent);
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.oss.mcam");
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getApplication().getPackageManager().getLaunchIntentForPackage("com.sec.android.gallery3d");
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
            Intent intent = new Intent(rotate.this,rotate2.class);
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
