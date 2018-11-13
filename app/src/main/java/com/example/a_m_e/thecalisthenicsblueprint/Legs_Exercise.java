package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Legs_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legs_exercise);


        ImageButton squats = findViewById(R.id.squats_imagebutton);
        ImageButton lunges = findViewById(R.id.lunges_imagebutton);
        ImageButton sidesquats = findViewById(R.id.sidesquats_imagebutton);
        ImageButton splitsquats = findViewById(R.id.bulgarian_squats_imagebutton);
        ImageButton wallsit = findViewById(R.id.wall_sit_imagebutton);
        ImageButton jumpingsquats = findViewById(R.id.jumping_squats_imagebutton);
        ImageButton jumpinglunges = findViewById(R.id.jumping_lunges_imagebutton);
        ImageButton weighted_squats = findViewById(R.id.weighted_squats_imagebutton);
        ImageButton weighted_lunges = findViewById(R.id.weighted_lunges_imagebutton);
        ImageButton broad_jumps = findViewById(R.id.broadjumps_imagebutton);
        ImageButton assisted_pistol = findViewById(R.id.assistedpistol_imagebutton);
        ImageButton pistol_squats = findViewById(R.id.pistolsquats_imagebutton);
        ImageButton glutehamraises = findViewById(R.id.gluteham_imagebutton);
        ImageButton frontsquats = findViewById(R.id.frontsquat_imagebutton);
        ImageButton glutebridges = findViewById(R.id.glutebridge_imagebutton);
        ImageButton oneleg_glutebridges = findViewById(R.id.one_leg_glutebridge_imagebutton);
        ImageButton calfraises = findViewById(R.id.calfraises_imagebutton);
        ImageButton oneleg_calfraises = findViewById(R.id.oneleg_calfraises_imagebutton);
        ImageButton boxjumps = findViewById(R.id.boxjumps_imagebutton);



        squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Squats.class);
                startActivity(intent);
            }
        });

        lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Lunges.class);
                startActivity(intent);
            }
        });

        sidesquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Sidesquats.class);
                startActivity(intent);
            }
        });

        splitsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Bulgarian.class);
                startActivity(intent);
            }
        });

        wallsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Wallsit.class);
                startActivity(intent);
            }
        });

        jumpingsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Jumpingsquats.class);
                startActivity(intent);
            }
        });

        jumpinglunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Jumpinglunges.class);
                startActivity(intent);
            }
        });

        weighted_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        weighted_lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Weighted_Lunges.class);
                startActivity(intent);
            }
        });

        broad_jumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Broadjumps.class);
                startActivity(intent);
            }
        });

        assisted_pistol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Assisted_Pistolsquats.class);
                startActivity(intent);
            }
        });

        pistol_squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Pistolsquats.class);
                startActivity(intent);
            }
        });

        glutehamraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_GHR.class);
                startActivity(intent);
            }
        });

        frontsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_FrontSquats.class);
                startActivity(intent);
            }
        });

        glutebridges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_GluteBridges.class);
                startActivity(intent);
            }
        });

        oneleg_glutebridges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Oneleg_Glutebridges.class);
                startActivity(intent);
            }
        });

        calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Calfraises.class);
                startActivity(intent);
            }
        });

        oneleg_calfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });


        boxjumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_BoxJumps.class);
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


