package com.example.androidlifecycle;

import android.app.LauncherActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements
        MyDialogFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LifeCycle.logStart();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.text_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment.newInstance().show(getSupportFragmentManager(), "MyDialogFragment");
                Intent intent = new Intent(MainActivity.this, MyActivity2.class);
                startActivity(intent);

            }
        });
        LifeCycle.logEnd();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        LifeCycle.logStart();
        super.onNewIntent(intent);
        LifeCycle.logEnd();
    }

    @Override
    protected void onStart() {
        LifeCycle.logStart();
        super.onStart();
        LifeCycle.logEnd();
    }

    @Override
    protected void onRestart() {
        LifeCycle.logStart();
        super.onRestart();
        LifeCycle.logEnd();
    }

    @Override
    protected void onResume() {
        LifeCycle.logStart();
        super.onResume();
        LifeCycle.logEnd();
    }

    @Override
    public void onPostCreate(
            @Nullable Bundle savedInstanceState) {
        LifeCycle.logStart();
        super.onPostCreate(savedInstanceState);
        LifeCycle.logEnd();
    }

    @Override
    protected void onPostResume() {
        LifeCycle.logStart();
        super.onPostResume();
        LifeCycle.logEnd();
    }

    @Override
    protected void onPause() {
        LifeCycle.logStart();
        super.onPause();
        LifeCycle.logEnd();
    }

    @Override
    protected void onStop() {
        LifeCycle.logStart();
        super.onStop();
        LifeCycle.logEnd();
    }

    @Override
    protected void onDestroy() {
        LifeCycle.logStart();
        super.onDestroy();
        LifeCycle.logEnd();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        LifeCycle.logStart();
        super.onAttachFragment(fragment);
        LifeCycle.logEnd();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        LifeCycle.logStart();
        super.onWindowFocusChanged(hasFocus);
        LifeCycle.logEnd();
    }

    // after onstop
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        LifeCycle.logStart();
        super.onSaveInstanceState(outState, outPersistentState);
        LifeCycle.logEnd();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        LifeCycle.logStart();
        super.onRestoreInstanceState(savedInstanceState);
        LifeCycle.logEnd();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

