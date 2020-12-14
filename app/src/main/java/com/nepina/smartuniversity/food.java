package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class food extends AppCompatActivity {
    public static final String msg1 = "com.nepina.smartuniversity.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

    }

    public void placeOrder(View view){

        Intent intent1 = new Intent(this,place_food.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName2);
        EditText editText2 = findViewById(R.id.editTextTextPersonName4);
        EditText editText3 = findViewById(R.id.editTextTextPersonName5);
        String message = "your order for"+" "+editText1.getText().toString()+","+editText2.getText().toString()+","+editText3.getText().toString()+" "+"has successfully received." +"Thank you!!";
        intent1.putExtra(msg1, message);
        startActivity(intent1);



    }
}