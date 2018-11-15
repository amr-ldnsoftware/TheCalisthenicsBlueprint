package com.example.a_m_e.thecalisthenicsblueprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Youtube_Mobility extends Fragment {
    View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //Coding is used to connect the exercises fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_mobility, container, false);


        ImageButton bicepsmobility = view.findViewById(R.id.biceps_imagebutton);





        bicepsmobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), biceps_mobility.class);
                startActivity(intent);
            }
        });



        return view;
    }



}
