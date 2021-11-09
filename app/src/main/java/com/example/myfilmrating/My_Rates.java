package com.example.myfilmrating;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class My_Rates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_rates);

        Button webbtn = (Button) findViewById(R.id.explicit_intent_web);
        ImageButton mes_open = (ImageButton) findViewById(R.id.mes);


        //al fer clic sobre el botó ens redirigeix a la pàgina web:
        webbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rottentomatoes.com"));
                startActivity(i2);
            }
        });

        //obre l'activity 4 (AddFilm)
        mes_open.setOnClickListener(v -> startActivity(new Intent(My_Rates.this, AddFilm.class)));


    }
}