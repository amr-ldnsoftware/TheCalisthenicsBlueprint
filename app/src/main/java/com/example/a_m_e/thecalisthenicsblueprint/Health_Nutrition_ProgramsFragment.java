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

public class Health_Nutrition_ProgramsFragment extends Fragment {
    View view;
    private ArrayList<Health_Nutrition_CardViewItem> nutritionList = new ArrayList<>();
    private RecyclerView mRecyclerView_nutrition;
    private RecyclerView.Adapter mAdapter_nutrition;
    private RecyclerView.LayoutManager mLayoutManager_nutrition;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter_nutrition = new Health_Nutrition_Adapter(nutritionList);
        mLayoutManager_nutrition = new LinearLayoutManager(getActivity());
        getFitnessCards();
    }

    //Coding is used to connect the exercises fragment to the nav link
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_health_nutrition, container, false);
        mRecyclerView_nutrition = view.findViewById(R.id.recyclerView_health_nutrition);
        mRecyclerView_nutrition.setAdapter(mAdapter_nutrition);
        mRecyclerView_nutrition.setLayoutManager(mLayoutManager_nutrition);
        return view;
    }


    public void getFitnessCards() {
        nutritionList.add(new Health_Nutrition_CardViewItem(R.drawable.vegan_protein, "VEGAN PROTEIN", "High Protein & Nutrient-Dense Powders", "Explore"));
        nutritionList.add(new Health_Nutrition_CardViewItem(R.drawable.herbal_powders, "HERBAL POWDERS", "Improves Overall Health & Reduces Muscle Recovery Time", "Explore"));
        nutritionList.add(new Health_Nutrition_CardViewItem(R.drawable.herbal_teas, "HERBAL TEAS", "Improves Digestion and Overall Well-Being   ", "Explore"));
        nutritionList.add(new Health_Nutrition_CardViewItem(R.drawable.bmi_dummy_gauge, "BMI CALCULATOR", "Find Out Your BMI", "Explore"));
    }
}


