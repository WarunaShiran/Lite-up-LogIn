package com.example.lonin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.lonin.R;

public class SecondActivity extends AppCompatActivity {

    ImageButton btnOrderFoods, btnViewOrders, viewProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnOrderFoods  = findViewById(R.id.imgBtnAddRes);
        btnViewOrders = findViewById(R.id.imgbtnViewRes);
        viewProfile =(ImageButton)findViewById(R.id.imgbtnHome);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btnOrderFoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SecondActivity.this,OrderFoods.class);
                startActivity(intent1);
            }

            // View Order intent

        });
      /*  viewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this,viewProfile.class));
            }
        });*/
    }
}
