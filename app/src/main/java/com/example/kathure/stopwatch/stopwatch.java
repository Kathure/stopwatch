package com.example.kathure.stopwatch;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class stopwatch extends AppCompatActivity {
    Chronometer mChronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);


        Button button;

        mChronometer = (Chronometer) findViewById(R.id.chronometer);

        //button clicks.
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(mStartListener);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(mStopListener);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(mResetListener);
    }

    View.OnClickListener mStartListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mChronometer.start();
        }
    };

    View.OnClickListener mStopListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mChronometer.stop();
        }
    };

    View.OnClickListener mResetListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mChronometer.setBase(SystemClock.elapsedRealtime());
        }
    };
}
