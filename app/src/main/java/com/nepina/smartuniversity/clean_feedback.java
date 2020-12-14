package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class clean_feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_feedback);

        Intent intent = getIntent();
        String message = intent.getStringExtra(clean.msg);
        //set text inside textview
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);

    }
}