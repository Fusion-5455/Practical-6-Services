package com.abhishek.practical6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.startBtn);
        Button stop = findViewById(R.id.stopBtn);
        Button next = findViewById(R.id.nextBtn);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startBtn:
                startService(new Intent(this , MyService.class));
                break;
            case R.id.stopBtn:
                stopService(new Intent(this , MyService.class));
                break;
            case R.id.nextBtn:
                Intent intent = new Intent(this , NextPage.class);
                startActivity(intent);
                break;
        }
    }
}