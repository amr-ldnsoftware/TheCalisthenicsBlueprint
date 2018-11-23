package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Dips_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dips_exercise);

        ImageButton normaldips = findViewById(R.id.normal_dips_imagebutton);
        ImageButton benchdips = findViewById(R.id.benchdips_imagebutton);
        ImageButton sb_dips = findViewById(R.id.sb_dips_imagebutton);
        ImageButton russiandips = findViewById(R.id.russian_dips_imagebutton);
        ImageButton slowdips = findViewById(R.id.slow_dips_imagebutton);
        ImageButton impossible_dips = findViewById(R.id.impossible_dips_imagebutton);
        ImageButton trans_dips = findViewById(R.id.trans_dips_imagebutton);
        ImageButton koreandips = findViewById(R.id.korean_dips_imagebutton);
        ImageButton weighted_dips = findViewById(R.id.weighted_dips_imagebutton);
        ImageButton ring_dips = findViewById(R.id.ring_dips_imagebutton);




        normaldips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Dips.class);
                startActivity(intent);
            }
        });

        benchdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Benchdips.class);
                startActivity(intent);
            }
        });

        sb_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });

        russiandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Russian_Dips.class);
                startActivity(intent);
            }
        });

        slowdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_SlowDips.class);
                startActivity(intent);
            }
        });

        impossible_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_ImpossibleDips.class);
                startActivity(intent);
            }
        });

        trans_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Trans_Dips.class);
                startActivity(intent);
            }
        });

        koreandips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Korean_Dips.class);
                startActivity(intent);
            }
        });


        weighted_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        ring_dips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ring_Dips.class);
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


