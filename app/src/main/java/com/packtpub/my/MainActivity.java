package com.packtpub.my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameActivity gameActivity= new   GameActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button playButton= findViewById(R.id.buttonplay);
        playButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        i= new Intent(this ,gameActivity.getClass());
        startActivity(i);
    }
}