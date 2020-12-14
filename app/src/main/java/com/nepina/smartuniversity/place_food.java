package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class place_food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_food);

        Intent intent1 = getIntent();
        String message = intent1.getStringExtra(food.msg1);
        TextView textView = findViewById(R.id.textView4);
        textView.setText(message);
    }
}