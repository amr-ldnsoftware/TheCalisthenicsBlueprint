package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AdvLevel4Week2 extends Fragment{
    private static final String TAG = "ADV1_Level4_Week2";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adv_level4_week2,container,false);

        return view;
    }
}
