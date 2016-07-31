package com.example.ksh.juzzlauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ksh on 2016-07-24.
 */
public class ThirdActivity extends Activity {


    Button startlauncher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        startlauncher = (Button)findViewById(R.id.startlauncher);

        startlauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(ThirdActivity.this,rotate.class);
                startActivity(intent);
            }
        });
    }
}
