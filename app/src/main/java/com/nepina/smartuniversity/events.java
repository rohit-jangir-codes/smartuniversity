package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class events extends AppCompatActivity {
    public static final String msg3 = "com.nepina.smartuniversity.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
    }

    public void create(View view) {

        Toast.makeText(events.this,
                "event created successfully!",
                Toast.LENGTH_SHORT).show();
        Intent intent5 = new Intent(this,event_show.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName10);
        EditText editText2 = findViewById(R.id.editTextTextPersonName11);
        EditText editText3 = findViewById(R.id.editTextTextPersonName7);
        String message4 = "your event for date:"+" "+editText1.getText().toString()+" ,"+"and time"+editText2.getText().toString()+", "+"named as"+editText3.getText().toString()+" "+"has successfully created." +"";
        intent5.putExtra(msg3, message4);
        startActivity(intent5);
    }
}