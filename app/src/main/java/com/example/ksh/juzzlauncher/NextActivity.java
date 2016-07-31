package com.example.ksh.juzzlauncher;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ksh on 2016-07-24.
 */
public class NextActivity extends Activity {
    Button gotonetactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        gotonetactivity = (Button) findViewById(R.id.gotothirdactivity);

        gotonetactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(NextActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}

