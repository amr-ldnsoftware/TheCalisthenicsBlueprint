package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Muscleups_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muscleups_exercise);

        ImageButton normal_muscleup = findViewById(R.id.normal_muscleup);
        ImageButton banded_muscleup = findViewById(R.id.banded_muscleup);
        ImageButton slow_muscleup = findViewById(R.id.slow_muscleup);
        ImageButton closegrip_muscleup = findViewById(R.id.closegrip_muscleup);
        ImageButton widegrip_muscleup = findViewById(R.id.widegrip_muscleup);
        ImageButton xgrip_muscleup = findViewById(R.id.xgrip_muscleup);
        ImageButton lsit_muscleup = findViewById(R.id.lsit_muscleup);
        ImageButton ring_muscleup = findViewById(R.id.ring_muscleup);
        ImageButton weighted_muscleup = findViewById(R.id.weighted_muscleup);



        normal_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        banded_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Banded_Muscleup.class);
                startActivity(intent);
            }
        });

        slow_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Slow_Muscleup.class);
                startActivity(intent);
            }
        });

        closegrip_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Closegrip_Muscleup.class);
                startActivity(intent);
            }
        });

        widegrip_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Muscleup.class);
                startActivity(intent);
            }
        });

        xgrip_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Xgrip_Muscleup.class);
                startActivity(intent);
            }
        });

        lsit_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lsit_Muscleup.class);
                startActivity(intent);
            }
        });

        ring_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ring_Muscleup.class);
                startActivity(intent);
            }
        });

        weighted_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weighted_Muscleup.class);
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


