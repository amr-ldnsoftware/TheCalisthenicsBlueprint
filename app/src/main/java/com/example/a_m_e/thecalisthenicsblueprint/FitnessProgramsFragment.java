package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FitnessProgramsFragment extends Fragment {
    View view;
    private ArrayList<ProgramCardViewItem> programList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ProgramAdapter(programList);
        mLayoutManager = new LinearLayoutManager(getActivity());
        getFitnessCards();
    }

    //Coding is used to connect the fitnessprogram fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fitnessprograms, container, false);
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
        return view;
    }


    public void getFitnessCards() {
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 1", " Fundamentals of Calisthenics", "Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 2", " Preparing for the Bodyweight Pull Up", "Introducing Calf Raises and Glute Bridges", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 3", " Building Pull Up Endurance", "Introducing Bar Leg Raises and Hollow Holds", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo, "BEGINNER - LEVEL 4", " Sets of 15 Pull Ups", "Introducing Straight Bar Dips", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trophyblue, "BEGINNER - LEVEL 5", " Weighted Pull Ups and Dips", "Introducing Lever Conditioning", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 1", " Banded Muscle Ups", "Introducing Russian and Transitional Dips", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 2", " Fundamentals of Calisthenics", "Introducing the Further Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 3", " Fundamentals of Calisthenics", "Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trimmed_logo2, "INTERMEDIATE - LEVEL 4", " Fundamentals of Calisthenics", "Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trophyblue, "INTERMEDIATE - LEVEL 5", " Fundamentals of Calisthenics", "Introducing the Further Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 1", " Fundamentals of Calisthenics", "Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 2", " Fundamentals of Calisthenics", "Introducing the Further Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 3", " Fundamentals of Calisthenics", "Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.wedge, "ADVANCED - LEVEL 4", " Fundamentals of Calisthenics", "Introducing the Basic Movements", "Start"));
            programList.add(new ProgramCardViewItem(R.drawable.trophyblue, "ADVANCED - LEVEL 5", " Fundamentals of Calisthenics", "Introducing the Further Movements", "Start"));
        }
    }


