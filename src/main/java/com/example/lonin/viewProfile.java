package com.example.lonin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lonin.R;

public class viewProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
    }

    public void goToEditfrofile(View v){

        Intent changePassword = new Intent(this, editProfile.class);
        startActivity(changePassword);
    }

    public void goToChangePassword(View v){

        Intent changePassword = new Intent(this, changePassword.class);
        startActivity(changePassword);
    }
}
