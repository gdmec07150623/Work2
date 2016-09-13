package com.s07150623.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","Apk onStart了，我知道了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","Apk onResume了，我知道了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work2","Apk onPause了，我知道了");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","Apk onStop了，我知道了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work2","Apk onRestart了，我知道了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","Apk onDestroy了，我知道了");
    }
}
