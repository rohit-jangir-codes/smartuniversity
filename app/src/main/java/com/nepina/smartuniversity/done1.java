package com.nepina.smartuniversity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class done1 extends AppCompatActivity {

    FloatingActionButton actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regi_done);







    }

    public void events(View view) {
        Intent intent4 = new Intent(this, events.class);
        startActivity(intent4);
        Toast.makeText(done1.this,
                "add an event",
                Toast.LENGTH_SHORT).show();

    }
}