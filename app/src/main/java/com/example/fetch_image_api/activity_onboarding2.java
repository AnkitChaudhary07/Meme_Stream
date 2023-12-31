package com.example.fetch_image_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class activity_onboarding2 extends AppCompatActivity {
    ImageView btnSkip, btnGetStarted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hide the action bar
        getSupportActionBar().hide();

        setContentView(R.layout.activity_onboarding2);

        btnSkip = findViewById(R.id.btnSkip);
        btnGetStarted = findViewById(R.id.btnGetStarted);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent skip = new Intent(activity_onboarding2.this, activity_onboarding3.class);
                startActivity(skip);
                finish();
            }
        });

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent getStarted = new Intent(activity_onboarding2.this, MainActivity.class);
                startActivity(getStarted);
                finish();
            }
        });
    }
}