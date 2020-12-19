package com.nepina.smartuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private Button eRegister;
    private TextView eAttemptsInfo;

    private String Username = "Admin";
    private String Password = "12345678";

    Boolean isValid = false;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttemptsInfo = findViewById(R.id.tvAttemptsInfo);
        eRegister = findViewById(R.id.btnRegister);

        eRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this,register.class);
                startActivity(intent);
            }
        });
        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(login.this,"Please enter all the details correctly...", Toast.LENGTH_SHORT).show();

                }else{
                    isValid = validate(inputName, inputPassword);
                    if(!isValid) {
                        counter--;
                        Toast.makeText(login.this, "Incorrect credentials..", Toast.LENGTH_SHORT).show();
                        eAttemptsInfo.setText("Remaining attempts are: " + counter);

                        if (counter == 0) {
                            eLogin.setEnabled(false);
                            Toast.makeText(login.this, "All attempts used..", Toast.LENGTH_SHORT).show();

                        }
                    }else{
                        Toast.makeText(login.this,
                                "Successful Login!",
                                Toast.LENGTH_SHORT).show();
                        Intent intent;
                        intent = new Intent(login.this,MainActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private boolean validate(String name, String password){
        if(name.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }
}