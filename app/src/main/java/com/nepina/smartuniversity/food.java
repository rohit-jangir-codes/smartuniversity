package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class food extends AppCompatActivity {
    public static final String msg1 = "com.nepina.smartuniversity.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

    }

    public void placeOrder(View view){

        Toast.makeText(food.this,
                "food ordered successfully",
                Toast.LENGTH_SHORT).show();

        Intent intent4 = new Intent(this,place_food.class);
        EditText editText1 = findViewById(R.id.editTextTextPersonName2);
        EditText editText2 = findViewById(R.id.editTextTextPersonName4);
        EditText editText3 = findViewById(R.id.editTextTextPersonName5);
        String message4 = "your order for"+" "+editText1.getText().toString()+","+editText2.getText().toString()+","+editText3.getText().toString()+" "+"has successfully received." +"Thank you!!";
        intent4.putExtra(msg1, message4);
        startActivity(intent4);



    }
}