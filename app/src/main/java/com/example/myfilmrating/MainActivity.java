package com.example.myfilmrating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goProfile = (Button) findViewById(R.id.profile_open_activity);
        Button goMyrates = (Button) findViewById(R.id.myrates_open_activity);

        // botó per obrir l'activity PROFILE:
        goProfile.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, Profile.class)));

        // botó per obrir l'activity MY RATES:
        goMyrates.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, My_Rates.class)));


    }




}