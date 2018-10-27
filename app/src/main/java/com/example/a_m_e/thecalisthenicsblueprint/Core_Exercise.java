package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Core_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.core_exercise);

        ImageButton situps = findViewById(R.id.situps_imagebutton);
        ImageButton romantwists = findViewById(R.id.romantwists_imagebutton);
        ImageButton floorlegraises = findViewById(R.id.floorlegraises_imagebutton);
        ImageButton windshieldwipers = findViewById(R.id.windshieldwipers_imagebutton);
        ImageButton kneeraises = findViewById(R.id.core_kneeraises_imagebutton);
        ImageButton plank = findViewById(R.id.plank_imagebutton);
        ImageButton sideplank = findViewById(R.id.sideplank_imagebutton);
        ImageButton barlegraises = findViewById(R.id.legraises_imagebutton);
        ImageButton sideknee_raises = findViewById(R.id.sideknee_raises_imagebutton);
        ImageButton hollowhold = findViewById(R.id.hollowhold_imagebutton);
        ImageButton lsit = findViewById(R.id.lsit_imagebutton);
        ImageButton toestobar = findViewById(R.id.toestobar_imagebutton);
        ImageButton ab_rollouts = findViewById(R.id.abrollouts_imagebutton);
        ImageButton vsit = findViewById(R.id.vsit_imagebutton);
        ImageButton dragonflag = findViewById(R.id.dragonflags_imagebutton);



        situps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Situps.class);
                startActivity(intent);
            }
        });

        romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });

        floorlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_FloorLegRaises.class);
                startActivity(intent);
            }
        });

        windshieldwipers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Windshield_Wipers.class);
                startActivity(intent);
            }
        });

        kneeraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Barkneeraises.class);
                startActivity(intent);
            }
        });

        plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        sideplank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Sideplank.class);
                startActivity(intent);
            }
        });

        barlegraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Bar_Legraises.class);
                startActivity(intent);
            }
        });

        sideknee_raises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Side_Kneeraises.class);
                startActivity(intent);
            }
        });

        hollowhold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Hollowholds.class);
                startActivity(intent);
            }
        });

        lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        toestobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Toestobar.class);
                startActivity(intent);
            }
        });

        ab_rollouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ab_Rollouts.class);
                startActivity(intent);
            }
        });

        vsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Vsit.class);
                startActivity(intent);
            }
        });

        dragonflag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Dragonflags.class);
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


