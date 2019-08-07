package com.example.lonin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.lonin.R;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button LogIn;
    private TextView userRegister;
    private int Counter = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        LogIn = (Button) findViewById(R.id.btnLogIn);
        userRegister = (TextView) findViewById(R.id.tvRegister);

        Info.setText("No of attempts remaining: 5");

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

        userRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
            }
        });

    }

    private void validate(String userName,String userPassword ){
        if((userName.equals( "Admin")  )&&(userPassword.equals( "1234")) ){
            Intent intent = new Intent(MainActivity.this, AdminHome.class);
            startActivity(intent);
        }else if ((userName.equals("User"))&&(userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        }else{
            Counter--;

           Info.setText("No of attempts remeining:" + String.valueOf(Counter));

            if(Counter == 0){
                LogIn.setEnabled(false);
            }
        }
        }
    }

