package com.example.lonin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class editProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }

    public void goToHome(View v){

        Intent home1 = new Intent(this, MainActivity.class);
        startActivity(home1);
    }

    public void goToMain(View v){

        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}
