package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdvLevel3Week2 extends Fragment{
    private static final String TAG = "ADV1_Level3_Week2";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adv_level3_week2,container,false);

        return view;
    }
}
