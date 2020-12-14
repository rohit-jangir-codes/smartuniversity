package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class clean extends AppCompatActivity {
    public static final String msg = "com.nepina.smartuniversity.Query";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean);
    }

    public void submit(View View){

        //for going to the next cleanfeedback page
        Intent intent=new Intent(this, clean_feedback.class);
        EditText editText1=findViewById(R.id.editTextTextPersonName);
        EditText editText2=findViewById(R.id.editTextTextPersonName3);
        EditText editText3=findViewById(R.id.editText);
        String message ="Your query for cleaning the place "+ editText1.getText().toString()+","
        + editText2.getText().toString()+","
        + editText3.getText().toString()+" "+" has been successfully received. we will be doing it soon. Thank you for your concern.";
        intent.putExtra(msg, message);
        startActivity(intent);
    }
}