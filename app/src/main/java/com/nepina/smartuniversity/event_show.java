package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class event_show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_show);

        Intent inte1 = getIntent();
        String message2 = inte1.getStringExtra(events.msg3);
        TextView textView = findViewById(R.id.textView11);
        textView.setText(message2);
    }
}