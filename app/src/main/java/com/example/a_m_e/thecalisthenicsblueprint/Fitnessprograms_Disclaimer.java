package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Fitnessprograms_Disclaimer extends AppCompatActivity {

    private DisclaimerAdapter mDisclaimerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitnessprograms_disclaimer);
        mDisclaimerAdapter = new DisclaimerAdapter(getSupportFragmentManager());



    }

}


