package com.londonsoftware.calisthenics.calisthenics;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RatingBar;

public class AdvLevel5Week2 extends Fragment implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "ADV1_Level5_Week2";

    private static final String SHARED_PREFS242= "sharedPrefs242";


    private CheckBox complete_workout_monday71;
    private CheckBox complete_workout_tuesday71;
    private CheckBox complete_workout_wednesday71;
    private CheckBox complete_workout_friday71;
    private CheckBox complete_workout_saturday71;
    private CheckBox complete_workout_sunday71;


    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY71 = "checkboxMonday71";
    private static final String CHECKBOX_TUESDAY71 = "checkboxTuesday71";
    private static final String CHECKBOX_WEDNESDAY71 = "checkboxWednesday71";
    private static final String CHECKBOX_FRIDAY71 = "checkboxFriday71";
    private static final String CHECKBOX_SATURDAY71 = "checkboxSaturday71";
    private static final String CHECKBOX_SUNDAY71 = "checkboxSaturday71";



    private boolean checkboxSaveMonday71;
    private boolean checkboxSaveTuesday71;
    private boolean checkboxSaveWednesday71;
    private boolean checkboxSaveFriday71;
    private boolean checkboxSaveSaturday71;
    private boolean checkboxSaveSunday71;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.adv_level5_week2,container,false);

        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_adv5wk2_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_adv5wk2_Tuesday);
        complete_workout_wednesday71 = (CheckBox) view.findViewById(R.id.checkBox_adv5wk2_wednesday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_adv5wk2_friday);
        complete_workout_saturday71 = (CheckBox) view.findViewById(R.id.checkBox_adv5wk2_Saturday);
        complete_workout_sunday71 = (CheckBox) view.findViewById(R.id.checkBox_adv5wk2_Sunday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_a5w2);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something242", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float242", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);

        ImageButton mon_weightedmuscleup = view.findViewById(R.id.mon_weightedmuscleup);
        ImageButton mon_sbd = view.findViewById(R.id.mon_sbd);
        ImageButton mon_weightedpullups = view.findViewById(R.id.mon_weightedpullups);
        ImageButton mon_weightedmuscleup2 = view.findViewById(R.id.mon_weightedmuscleup2);
        ImageButton mon_weightedmuscleup3 = view.findViewById(R.id.mon_weightedmuscleup3);
        ImageButton mon_weightedmuscleup4 = view.findViewById(R.id.mon_weightedmuscleup4);
        ImageButton mon_weightedmuscleup5 = view.findViewById(R.id.mon_weightedmuscleup5);
        ImageButton mon_muscleup = view.findViewById(R.id.mon_muscleup);

        ImageButton tues_weightedsquats = view.findViewById(R.id.tues_weightedsquats);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.tues_weightedsquats2);
        ImageButton tues_weightedlunges = view.findViewById(R.id.tues_weightedlunges);
        ImageButton tues_frontsquats = view.findViewById(R.id.tues_frontsquats);
        ImageButton tues_pistolsquats = view.findViewById(R.id.tues_pistolsquats);
        ImageButton tues_ghr = view.findViewById(R.id.tues_ghr);

        ImageButton wed_weighteddips = view.findViewById(R.id.wed_weighteddips);
        ImageButton wed_lsitmuscleup = view.findViewById(R.id.wed_lsitmuscleup);
        ImageButton wed_straddleplanche = view.findViewById(R.id.wed_straddleplanche);
        ImageButton wed_weighteddips2 = view.findViewById(R.id.wed_weighteddips2);
        ImageButton wed_muscleups = view.findViewById(R.id.wed_muscleups);
        ImageButton wed_ringdips = view.findViewById(R.id.wed_ringdips);
        ImageButton wed_ninetydegree = view.findViewById(R.id.wed_ninetydegree);

        ImageButton thurs_foamrolling = view.findViewById(R.id.foamicon);

        ImageButton fri_weightedpulls = view.findViewById(R.id.fri_weightedpulls);
        ImageButton fri_weightedmuscleups = view.findViewById(R.id.fri_weightedmuscleups);
        ImageButton fri_ringmuscleups = view.findViewById(R.id.fri_ringmuscleups);
        ImageButton fri_onearmpullup = view.findViewById(R.id.fri_onearmpullup);
        ImageButton fri_muscleups2 = view.findViewById(R.id.fri_muscleups2);
        ImageButton fri_straddleplanche = view.findViewById(R.id.fri_straddleplanche);
        ImageButton fri_leverpullups = view.findViewById(R.id.fri_leverpullups);
        ImageButton fri_frontlever = view.findViewById(R.id.fri_frontlever);
        ImageButton fri_ninetydegree = view.findViewById(R.id.fri_ninetydegree);
        ImageButton fri_handstandpushups = view.findViewById(R.id.fri_handstandpushups);

        ImageButton sat_weightedsquats = view.findViewById(R.id.sat_weightedsquats);
        ImageButton sat_weightedsquats2 = view.findViewById(R.id.sat_weightedsquats2);
        ImageButton sat_ghr = view.findViewById(R.id.sat_ghr);
        ImageButton sat_onelegcalfraises = view.findViewById(R.id.sat_onelegcalfraises);

        ImageButton sun_maltese = view.findViewById(R.id.sun_maltese);
        ImageButton sun_planche = view.findViewById(R.id.sun_planche);
        ImageButton sun_straddleplanche = view.findViewById(R.id.sun_straddleplanche);
        ImageButton sun_frontlever = view.findViewById(R.id.sun_frontlever);
        ImageButton sun_backlever = view.findViewById(R.id.sun_backlever);
        ImageButton sun_humanflag = view.findViewById(R.id.sun_humanflag);








        mon_weightedmuscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_weightedmuscleup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_weightedmuscleup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_weightedmuscleup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });


        mon_weightedmuscleup5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        mon_sbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_SB_Dips.class);
                startActivity(intent);
            }
        });


        mon_weightedpullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });


        tues_frontsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_FrontSquats.class);
                startActivity(intent);
            }
        });

        tues_ghr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GHR.class);
                startActivity(intent);
            }
        });


        tues_pistolsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Pistolsquats.class);
                startActivity(intent);
            }
        });

        tues_weightedlunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Lunges.class);
                startActivity(intent);
            }
        });

        tues_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        tues_weightedsquats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        wed_lsitmuscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit_Muscleup.class);
                startActivity(intent);
            }
        });


        wed_muscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        wed_ninetydegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_NinetyDeg_Handstand.class);
                startActivity(intent);
            }
        });

        wed_ringdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Dips.class);
                startActivity(intent);
            }
        });

        wed_straddleplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        wed_weighteddips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        wed_weighteddips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Dips.class);
                startActivity(intent);
            }
        });

        thurs_foamrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });



        fri_frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        fri_handstandpushups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Handstand_Pushups.class);
                startActivity(intent);
            }
        });

        fri_leverpullups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lever_Pullups.class);
                startActivity(intent);
            }
        });

        fri_muscleups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        fri_ninetydegree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_NinetyDeg_Handstand.class);
                startActivity(intent);
            }
        });

        fri_onearmpullup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Onearm.class);
                startActivity(intent);
            }
        });


        fri_ringmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Muscleup.class);
                startActivity(intent);
            }
        });

        fri_ringmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Muscleup.class);
                startActivity(intent);
            }
        });


        fri_straddleplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });


        fri_weightedmuscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
                startActivity(intent);
            }
        });

        fri_weightedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        sat_ghr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GHR.class);
                startActivity(intent);
            }
        });

        sat_onelegcalfraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Oneleg_CalfRaises.class);
                startActivity(intent);
            }
        });

        sat_weightedsquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sat_weightedsquats2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });

        sun_backlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Backlever.class);
                startActivity(intent);
            }
        });

        sun_frontlever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Frontlever.class);
                startActivity(intent);
            }
        });

        sun_humanflag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_HumanFlag.class);
                startActivity(intent);
            }
        });

        sun_maltese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Maltese.class);
                startActivity(intent);
            }
        });

        sun_straddleplanche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Straddle_Planche.class);
                startActivity(intent);
            }
        });

        sun_planche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Planche.class);
                startActivity(intent);
            }
        });




        complete_workout_monday71.setOnCheckedChangeListener(this);
        complete_workout_tuesday71.setOnCheckedChangeListener(this);
        complete_workout_wednesday71.setOnCheckedChangeListener(this);
        complete_workout_friday71.setOnCheckedChangeListener(this);
        complete_workout_saturday71.setOnCheckedChangeListener(this);
        complete_workout_sunday71.setOnCheckedChangeListener(this);



        loadData();
        updateViews();

        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData();
        switch (buttonView.getId()) {

            case R.id.checkBox_adv5wk2_monday:

                break;


            case R.id.checkBox_adv5wk2_Tuesday:

                break;


            case R.id.checkBox_adv5wk2_wednesday:

                break;


            case R.id.checkBox_adv5wk2_friday:

                break;

            case R.id.checkBox_adv5wk2_Saturday:

                break;

            case R.id.checkBox_adv5wk2_Sunday:

                break;
        }
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS242, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY71, complete_workout_wednesday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY71, complete_workout_saturday71.isChecked());
        editor.putBoolean(CHECKBOX_SUNDAY71, complete_workout_sunday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS242, Context.MODE_PRIVATE);

        checkboxSaveMonday71 = sharedPreferences.getBoolean(CHECKBOX_MONDAY71, false);
        checkboxSaveTuesday71 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY71, false);
        checkboxSaveWednesday71 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY71, false);
        checkboxSaveFriday71 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY71, false);
        checkboxSaveSaturday71 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY71, false);
        checkboxSaveSunday71 = sharedPreferences.getBoolean(CHECKBOX_SUNDAY71, false);


    }

    public void updateViews() {
        complete_workout_monday71.setChecked(checkboxSaveMonday71);
        complete_workout_tuesday71.setChecked(checkboxSaveTuesday71);
        complete_workout_wednesday71.setChecked(checkboxSaveWednesday71);
        complete_workout_friday71.setChecked(checkboxSaveFriday71);
        complete_workout_saturday71.setChecked(checkboxSaveSaturday71);
        complete_workout_sunday71.setChecked(checkboxSaveSunday71);

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float242", rating);
        editor_rating.putInt("numStars242", numStars);
        editor_rating.apply();
    }
}
