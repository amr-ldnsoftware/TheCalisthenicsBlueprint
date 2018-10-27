package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class Humanflag_Exercise extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.humanflag_exercise);

        ImageButton humanflag = findViewById(R.id.human_flag_imagebutton);
        ImageButton kneetuck_flag = findViewById(R.id.kneetuck_flag_imagebutton);
        ImageButton negative_flag = findViewById(R.id.negtive_flag_imagebutton);
        ImageButton xgrip_flag = findViewById(R.id.xgrip_flag_imagebutton);
        ImageButton flag_pullups = findViewById(R.id.flag_pullups_imagebutton);



        humanflag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_HumanFlag.class);
                startActivity(intent);
            }
        });

        kneetuck_flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Kneetuck_Flag.class);
                startActivity(intent);
            }
        });

        negative_flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Negative_Flag.class);
                startActivity(intent);
            }
        });

        xgrip_flag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Xgrip_Flag.class);
                startActivity(intent);
            }
        });

        flag_pullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Youtube_Flag_Pullups.class);
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


