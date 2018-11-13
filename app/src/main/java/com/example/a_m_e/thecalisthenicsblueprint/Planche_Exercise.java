package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Planche_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planche_exercise);

        ImageButton planche = findViewById(R.id.planche_imagebutton);
        ImageButton straddle_planche = findViewById(R.id.straddle_planche_imagebutton);
        ImageButton planche_tucks = findViewById(R.id.planche_tucks_imagebutton);
        ImageButton maltese = findViewById(R.id.maltese_imagebutton);
        ImageButton planche_pushups = findViewById(R.id.planche_pushups_imagebutton);



        planche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche.class);
                startActivity(intent);
            }
        });

        straddle_planche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        planche_tucks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Tucks.class);
                startActivity(intent);
            }
        });

        maltese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Maltese.class);
                startActivity(intent);
            }
        });


        planche_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Pushups.class);
                startActivity(intent);
            }
        });








        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}


