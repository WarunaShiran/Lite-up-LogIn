package com.example.lonin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.lonin.R;
import com.example.lonin.ViewRestaurant;

public class AdminHome extends AppCompatActivity {

    ImageButton btnAddRes, btnViewRes, viewProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        btnAddRes  = findViewById(R.id.imgBtnAddRes);
        btnViewRes = findViewById(R.id.imgbtnViewRes);
        viewProfile =(ImageButton)findViewById(R.id.imgbtnHome);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnViewRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(AdminHome.this, ViewRestaurant.class);
                startActivity(intent1);
            }

            // Add Restaurant intent

        });
        viewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AdminHome.this,viewProfile.class));
            }
        });
    }
}
