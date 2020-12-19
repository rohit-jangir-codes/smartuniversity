package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class preference extends AppCompatActivity {
    public static final String msg5 = "com.nepina.smartuniversity.update";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

    }

    public void profile(View view) {
        Toast.makeText(preference.this,
                "can't select the photo",
                Toast.LENGTH_SHORT).show();
    }

    public void update(View view) {
        Intent intent=new Intent(this, update.class);
        EditText editText1=findViewById(R.id.editTextTextPersonName12);
        EditText editText2=findViewById(R.id.editTextTextPersonName13);

        EditText editText3=findViewById(R.id.editTextTextPersonName14);
        EditText editText4=findViewById(R.id.editTextTextPersonName16);

        String message5 ="Your profile is updated as name:"+ editText1.getText().toString()+",E-mail:"
                + editText2.getText().toString()+",and phone number:"
                + editText3.getText().toString()+"for current semester "+editText4.getText().toString();
        intent.putExtra(msg5, message5);
        startActivity(intent);
        Toast.makeText(preference.this,
                "profile updated",
                Toast.LENGTH_SHORT).show();
    }
}