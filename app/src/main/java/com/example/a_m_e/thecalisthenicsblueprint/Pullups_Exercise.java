package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Pullups_Exercise extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pullups_exercise);

        //Place all image button IDs here
        ImageButton pullnormal = findViewById(R.id.pull_normal);
        ImageButton chinup = findViewById(R.id.chin_ups);
        ImageButton closegrip_pull = findViewById(R.id.closegrip_pulls);
        ImageButton closegrip_chin = findViewById(R.id.closegrip_chins);
        ImageButton widegrip_pull = findViewById(R.id.widegrip_pulls);
        ImageButton widegrip_chin = findViewById(R.id.widegrip_chinups);
        ImageButton bandpulls = findViewById(R.id.band_pulls);
        ImageButton deadhang = findViewById(R.id.deadhang);
        ImageButton isometric = findViewById(R.id.isometric_holds);
        ImageButton aussie = findViewById(R.id.aussie_pulls);
        ImageButton negative_pullup = findViewById(R.id.negative_pullups);
        ImageButton neutral_grip = findViewById(R.id.neutral_grip_pullups);
        ImageButton commando = findViewById(R.id.commando_pulls);
        ImageButton highpull = findViewById(R.id.high_pullups);
        ImageButton behind_the_neck = findViewById(R.id.behindtheneck_pulls);
        ImageButton type_writers = findViewById(R.id.type_writers);
        ImageButton archer = findViewById(R.id.archer_pullups);
        ImageButton clapping = findViewById(R.id.clapping_pullups);
        ImageButton gripswitch = findViewById(R.id.grip_switch_pulls);
        ImageButton l_sit_chinup = findViewById(R.id.lsit_chinups);
        ImageButton scapula = findViewById(R.id.scapula_pullups);
        ImageButton weighted_pulls = findViewById(R.id.weighted_pullups);
        ImageButton onearm = findViewById(R.id.onearm_pullup);
        ImageButton ringpull = findViewById(R.id.ring_pullups);


        //Place all ClickListeners for the Imagebuttons here
        pullnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        chinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Chinup.class);
                startActivity(intent);
            }
        });

        closegrip_pull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Closegrip_Pull.class);
                startActivity(intent);
            }
        });

        closegrip_chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Normal_Closegrip_Chin.class);
                startActivity(intent);
            }
        });

        widegrip_pull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Pull.class);
                startActivity(intent);
            }
        });

        widegrip_chin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widegrip_Chin.class);
                startActivity(intent);
            }
        });

        bandpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Bandpulls.class);
                startActivity(intent);
            }
        });

        deadhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Deadhang.class);
                startActivity(intent);
            }
        });

        isometric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        aussie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Aussie.class);
                startActivity(intent);
            }
        });

        negative_pullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Negative.class);
                startActivity(intent);
            }
        });

        neutral_grip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Neutral.class);
                startActivity(intent);
            }
        });

        commando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Commando.class);
                startActivity(intent);
            }
        });

        highpull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Highpull.class);
                startActivity(intent);
            }
        });

        behind_the_neck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Behindtheneck.class);
                startActivity(intent);
            }
        });

        type_writers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Typewriters.class);
                startActivity(intent);
            }
        });

        archer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Archer.class);
                startActivity(intent);
            }
        });

        clapping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Clapping.class);
                startActivity(intent);
            }
        });

        gripswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Gripswitch.class);
                startActivity(intent);
            }
        });

        l_sit_chinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lsit_Chinup.class);
                startActivity(intent);
            }
        });

        scapula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Scapula.class);
                startActivity(intent);
            }
        });

        weighted_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        onearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Onearm.class);
                startActivity(intent);
            }
        });

        ringpull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ringpulls.class);
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


