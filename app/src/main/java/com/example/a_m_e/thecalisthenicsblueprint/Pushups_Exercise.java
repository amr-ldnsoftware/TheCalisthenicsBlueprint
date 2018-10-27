package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Pushups_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushups_exercise);

        ImageButton pushupnormal = findViewById(R.id.normal_pushup_imagebutton);
        ImageButton kneepushups = findViewById(R.id.knee_pushups_imagebutton);
        ImageButton widepushups = findViewById(R.id.wide_pushups_imagebutton);
        ImageButton closeposition = findViewById(R.id.closeposition_pushups_imagebutton);
        ImageButton diamondpushups = findViewById(R.id.diamondpushups_imagebutton);
        ImageButton spidermanpushups = findViewById(R.id.spiderman_imagebutton);
        ImageButton sb_pushups = findViewById(R.id.sb_pushups_imagebutton);
        ImageButton russianpushups = findViewById(R.id.russian_pushups_imagebutton);
        ImageButton clapping_pushups = findViewById(R.id.clapping_pushups_imagebutton);
        ImageButton hindupushups = findViewById(R.id.hindu_pushups_imagebutton);
        ImageButton pikepushups = findViewById(R.id.pikepushups_imagebutton);
        ImageButton raised_pike_pushups = findViewById(R.id.raised_pikes_imagebutton);
        ImageButton parral_pushups = findViewById(R.id.parall_pushups_imagebutton);
        ImageButton weighted_pushups = findViewById(R.id.weighted_pushups_imagebutton);
        ImageButton archer_pushups = findViewById(R.id.archer_pushups_imagebutton);
        ImageButton slow_pushups = findViewById(R.id.slow_pushup_imagebutton);
        ImageButton raised_decline_pushups = findViewById(R.id.raised_decline_pushup_imagebutton);
        ImageButton pseudo_pushups = findViewById(R.id.pseudo_pushup_imagebutton);
        ImageButton tuckedplanche_pushups = findViewById(R.id.tuck_planche_pushups_imagebutton);
        ImageButton handstand_pushups = findViewById(R.id.handstand_pushups_imagebutton);
        ImageButton planche_pushups = findViewById(R.id.planche_pushups_imagebutton);
        ImageButton ring_pushups = findViewById(R.id.ring_pushups_imagebutton);
        ImageButton onearm_pushups = findViewById(R.id.onearm_pushups_imagebutton);
        ImageButton skullcrushers = findViewById(R.id.skullcrushers_imagebutton);




        pushupnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_PushUp.class);
                startActivity(intent);
            }
        });

        kneepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_KneePushups.class);
                startActivity(intent);
            }
        });

        widepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Widepushup.class);
                startActivity(intent);
            }
        });

        closeposition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_ClosePosition.class);
                startActivity(intent);
            }
        });

        diamondpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Diamond_Pushups.class);
                startActivity(intent);
            }
        });

        spidermanpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Spiderman_Pushups.class);
                startActivity(intent);
            }
        });

        sb_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Straightbar_Pushups.class);
                startActivity(intent);
            }
        });

        russianpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Russian_Pushups.class);
                startActivity(intent);
            }
        });

        clapping_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Clapping_Pushups.class);
                startActivity(intent);
            }
        });

        hindupushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Hindu_Pushups.class);
                startActivity(intent);
            }
        });

        pikepushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Pike_Pushups.class);
                startActivity(intent);
            }
        });

        raised_pike_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Raised_Pike_Pushups.class);
                startActivity(intent);
            }
        });

        parral_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Paral_Pushups.class);
                startActivity(intent);
            }
        });

        weighted_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weighted_Pushups.class);
                startActivity(intent);
            }
        });

        archer_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Archer_Pushups.class);
                startActivity(intent);
            }
        });

        slow_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Slow_Pushups.class);
                startActivity(intent);
            }
        });

        raised_decline_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Raised_Decline_Pushups.class);
                startActivity(intent);
            }
        });

        pseudo_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Pseudo.class);
                startActivity(intent);
            }
        });

        tuckedplanche_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Tuckedplanche_pushups.class);
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

        planche_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Planche_Pushups.class);
                startActivity(intent);
            }
        });

        ring_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Ringpushups.class);
                startActivity(intent);
            }
        });

        onearm_pushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Onearm_Pushups.class);
                startActivity(intent);
            }
        });

        skullcrushers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_SkullCrushers.class);
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


