package com.londonsoftware.calisthenics.calisthenics;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeFragment extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        CircleImageView firstimage = view.findViewById(R.id.profile_image);
        CircleImageView secondimage = view.findViewById(R.id.profile_image2);
        CircleImageView thirdimage = view.findViewById(R.id.profile_image3);
        CircleImageView fourthimage = view.findViewById(R.id.profile_image4);

        firstimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BegLevel1.class);
                startActivity(intent);
            }
        });

        secondimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Pullups_Exercise.class);
                startActivity(intent);
            }
        });

        thirdimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdvLevel3.class);
                startActivity(intent);
            }
        });

        fourthimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NewNoteActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }

}
