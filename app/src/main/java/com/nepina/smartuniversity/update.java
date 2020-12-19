package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);


        Intent inte1 = getIntent();
        String message5 = inte1.getStringExtra(preference.msg5);
        TextView textView = findViewById(R.id.textView12);
        textView.setText(message5);

    }
}