package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Handstands_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handstands_exercise);


        ImageButton floor_handstands = findViewById(R.id.handstands_floor_imagebutton);
        ImageButton wall_assisted_handstands = findViewById(R.id.wall_assisted_handstands_imagebutton);
        ImageButton handstand_pushups = findViewById(R.id.handstand_pushups_imagebutton);
        ImageButton tigerbend = findViewById(R.id.tiger_bend_imagebutton);
        ImageButton ninety_deg_handstand = findViewById(R.id.ninety_degree_imagebutton);



        floor_handstands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Handstands_Floor_Var.class);
                startActivity(intent);
            }
        });

        wall_assisted_handstands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Wall_Handstands.class);
                startActivity(intent);
            }
        });


        handstand_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Handstand_Pushups.class);
                startActivity(intent);
            }
        });

        tigerbend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Tigerbend_Handstands.class);
                startActivity(intent);
            }
        });

        ninety_deg_handstand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_NinetyDeg_Handstand.class);
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


