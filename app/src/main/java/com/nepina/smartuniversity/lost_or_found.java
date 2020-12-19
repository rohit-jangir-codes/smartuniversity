package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class lost_or_found extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost_or_found);


    }

    public void query(View view) {

        Toast.makeText(lost_or_found.this,
                "your query is posted",
                Toast.LENGTH_SHORT).show();
    }
}