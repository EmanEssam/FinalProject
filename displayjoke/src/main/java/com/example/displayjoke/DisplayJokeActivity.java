package com.example.displayjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke_activty);
        TextView jokeTv = findViewById(R.id.joke_tv);
        jokeTv.setText(getIntent().getExtras().get("joke").toString());
    }
}
