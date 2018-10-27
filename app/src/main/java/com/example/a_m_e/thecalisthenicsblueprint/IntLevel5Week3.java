package com.example.a_m_e.thecalisthenicsblueprint;

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

public class IntLevel5Week3 extends Fragment  implements CompoundButton.OnCheckedChangeListener, RatingBar.OnRatingBarChangeListener{
    private static final String TAG = "INT1_Level5_Week3";

    private static final String SHARED_PREFS123= "sharedPrefs123";


    private CheckBox complete_workout_monday71;
    private CheckBox complete_workout_tuesday71;
    private CheckBox complete_workout_wednesday71;
    private CheckBox complete_workout_thursday71;
    private CheckBox complete_workout_friday71;
    private CheckBox complete_workout_saturday71;

    RatingBar ratingBar;
    SharedPreferences sharedPreferences_rating;
    SharedPreferences.Editor editor_rating;

    private static final String CHECKBOX_MONDAY71 = "checkboxMonday71";
    private static final String CHECKBOX_TUESDAY71 = "checkboxTuesday71";
    private static final String CHECKBOX_WEDNESDAY71 = "checkboxWednesday71";
    private static final String CHECKBOX_THURSDAY71 = "checkboxThursday71";
    private static final String CHECKBOX_FRIDAY71 = "checkboxFriday71";
    private static final String CHECKBOX_SATURDAY71 = "checkboxSaturday71";



    private boolean checkboxSaveMonday71;
    private boolean checkboxSaveTuesday71;
    private boolean checkboxSaveWednesday71;
    private boolean checkboxSaveThursday71;
    private boolean checkboxSaveFriday71;
    private boolean checkboxSaveSaturday71;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.int_level5_week3,container,false);

        complete_workout_monday71 = (CheckBox) view.findViewById(R.id.checkBox_int5wk3_monday);
        complete_workout_tuesday71 = (CheckBox) view.findViewById(R.id.checkBox_int5wk3_Tuesday);
        complete_workout_wednesday71 = (CheckBox) view.findViewById(R.id.checkBox_int5wk3_wednesday);
        complete_workout_thursday71 = (CheckBox) view.findViewById(R.id.checkBox_int5wk3_thursday);
        complete_workout_friday71 = (CheckBox) view.findViewById(R.id.checkBox_int5wk3_friday);
        complete_workout_saturday71 = (CheckBox) view.findViewById(R.id.checkBox_int5wk3_Saturday);



        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar_i5w3);
        ratingBar.setOnRatingBarChangeListener(this);
        sharedPreferences_rating = getActivity().getSharedPreferences("something123", Context.MODE_PRIVATE);
        float rating = sharedPreferences_rating.getFloat("float123", 0f);
        ratingBar.setRating(rating);
        ratingBar.setStepSize(1f);


        ImageButton mon_weightedmuscleup = view.findViewById(R.id.mon_weightedmuscleup);
        ImageButton mon_muscleup = view.findViewById(R.id.mon_muscleup);
        ImageButton mon_muscleup2 = view.findViewById(R.id.mon_muscleup2);
        ImageButton mon_weightedmuscleup2 = view.findViewById(R.id.mon_weightedmuscleup2);
        ImageButton mon_muscleup3 = view.findViewById(R.id.mon_muscleup3);
        ImageButton mon_sbd = view.findViewById(R.id.mon_sbd);
        ImageButton mon_pulls = view.findViewById(R.id.mon_pulls);
        ImageButton mon_wallhandstand = view.findViewById(R.id.mon_wallhandstand);
        ImageButton mon_raisedpikes = view.findViewById(R.id.mon_raisedpikes);
        ImageButton mon_lsit = view.findViewById(R.id.mon_lsit);

        ImageButton tues_weightedsquats = view.findViewById(R.id.tues_weightedsquats);
        ImageButton tues_weightedsquats2 = view.findViewById(R.id.tues_weightedsquats2);
        ImageButton tues_weightedsquats3 = view.findViewById(R.id.tues_weightedsquats3);
        ImageButton tues_ghr = view.findViewById(R.id.tues_ghr);

        ImageButton wed_weightedpulls = view.findViewById(R.id.wed_weightedpulls);
        ImageButton wed_pulls = view.findViewById(R.id.wed_pulls);
        ImageButton wed_iso = view.findViewById(R.id.wed_iso);
        ImageButton wed_iso2 = view.findViewById(R.id.wed_iso2);
        ImageButton wed_bandedlevers = view.findViewById(R.id.wed_bandedlevers);
        ImageButton wed_dragonflags = view.findViewById(R.id.wed_dragonflags);

        ImageButton thurs_wallhandstand = view.findViewById(R.id.thurs_wallhandstand);
        ImageButton thurs_raisedpikes = view.findViewById(R.id.thurs_raisedpikes);
        ImageButton thurs_backextensions = view.findViewById(R.id.thurs_backextensions);
        ImageButton thurs_frontleverraises = view.findViewById(R.id.thurs_frontleverraises);
        ImageButton thurs_lsit = view.findViewById(R.id.thurs_lsit);
        ImageButton thurs_toestobar = view.findViewById(R.id.thurs_toestobar);
        ImageButton thurs_romantwists = view.findViewById(R.id.thurs_romantwists);
        ImageButton thurs_windshield = view.findViewById(R.id.thurs_windshield);
        ImageButton thurs_plank = view.findViewById(R.id.thurs_plank);

        ImageButton fri_ringmuscleups = view.findViewById(R.id.fri_ringmuscleups);
        ImageButton fri_muscleups = view.findViewById(R.id.fri_muscleups);
        ImageButton fri_ringmuscleups2 = view.findViewById(R.id.fri_ringmuscleups2);
        ImageButton fri_muscleups2 = view.findViewById(R.id.fri_muscleups2);
        ImageButton fri_ringdips = view.findViewById(R.id.fri_ringdips);
        ImageButton fri_ringpushes = view.findViewById(R.id.fri_ringpushes);
        ImageButton fri_russianpushes = view.findViewById(R.id.fri_russianpushes);

        ImageButton sat_weightedsquats = view.findViewById(R.id.sat_weightedsquats);
        ImageButton sat_ghr = view.findViewById(R.id.sat_ghr);
        ImageButton sat_weightedsquats2 = view.findViewById(R.id.sat_weightedsquats2);
        ImageButton sat_onelegcalfraises = view.findViewById(R.id.sat_onelegcalfraises);

        ImageButton sun_mobility = view.findViewById(R.id.stretchicon);
        ImageButton sun_foamrolling = view.findViewById(R.id.foamicon);





        mon_muscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_muscleup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_muscleup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
                startActivity(intent);
            }
        });

        mon_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        mon_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        mon_raisedpikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Raised_Pike_Pushups.class);
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

        mon_wallhandstand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wall_Handstands.class);
                startActivity(intent);
            }
        });

        mon_weightedmuscleup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Muscleup.class);
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

        tues_ghr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_GHR.class);
                startActivity(intent);
            }
        });

        tues_weightedsquats3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weighted_Squats.class);
                startActivity(intent);
            }
        });


        wed_bandedlevers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Banded_Levers.class);
                startActivity(intent);
            }
        });

        wed_dragonflags.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Dragonflags.class);
                startActivity(intent);
            }
        });

        wed_iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        wed_iso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Isometrics.class);
                startActivity(intent);
            }
        });

        wed_pulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Pullup.class);
                startActivity(intent);
            }
        });

        wed_weightedpulls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Weightedpulls.class);
                startActivity(intent);
            }
        });

        thurs_backextensions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_BackExtensions.class);
                startActivity(intent);
            }
        });

        thurs_frontleverraises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Kneetuck_Raises.class);
                startActivity(intent);
            }
        });

        thurs_lsit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Lsit.class);
                startActivity(intent);
            }
        });

        thurs_plank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Plank.class);
                startActivity(intent);
            }
        });

        thurs_raisedpikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Raised_Pike_Pushups.class);
                startActivity(intent);
            }
        });

        thurs_romantwists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Romantwists.class);
                startActivity(intent);
            }
        });


        thurs_toestobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Toestobar.class);
                startActivity(intent);
            }
        });

        thurs_wallhandstand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Wall_Handstands.class);
                startActivity(intent);
            }
        });

        thurs_windshield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Windshield_Wipers.class);
                startActivity(intent);
            }
        });

        fri_muscleups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Normal_Muscleups.class);
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

        fri_ringdips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Dips.class);
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

        fri_ringmuscleups2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ring_Muscleup.class);
                startActivity(intent);
            }
        });

        fri_ringpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Ringpushups.class);
                startActivity(intent);
            }
        });

        fri_russianpushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Russian_Pushups.class);
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

        sun_foamrolling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Foamroll.class);
                startActivity(intent);
            }
        });

        sun_mobility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Youtube_Mobility.class);
                startActivity(intent);
            }
        });






        complete_workout_monday71.setOnCheckedChangeListener(this);
        complete_workout_tuesday71.setOnCheckedChangeListener(this);
        complete_workout_wednesday71.setOnCheckedChangeListener(this);
        complete_workout_thursday71.setOnCheckedChangeListener(this);
        complete_workout_friday71.setOnCheckedChangeListener(this);
        complete_workout_saturday71.setOnCheckedChangeListener(this);


        loadData();
        updateViews();


        return view;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        saveData();
        switch (buttonView.getId()) {

            case R.id.checkBox_int5wk3_monday:

                break;


            case R.id.checkBox_int5wk3_Tuesday:

                break;


            case R.id.checkBox_int5wk3_wednesday:

                break;

            case R.id.checkBox_int5wk3_thursday:

                break;

            case R.id.checkBox_int5wk3_friday:

                break;

            case R.id.checkBox_int5wk3_Saturday:

                break;
        }
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS123, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(CHECKBOX_MONDAY71, complete_workout_monday71.isChecked());
        editor.putBoolean(CHECKBOX_TUESDAY71, complete_workout_tuesday71.isChecked());
        editor.putBoolean(CHECKBOX_WEDNESDAY71, complete_workout_wednesday71.isChecked());
        editor.putBoolean(CHECKBOX_THURSDAY71, complete_workout_thursday71.isChecked());
        editor.putBoolean(CHECKBOX_FRIDAY71, complete_workout_friday71.isChecked());
        editor.putBoolean(CHECKBOX_SATURDAY71, complete_workout_saturday71.isChecked());


        editor.apply();

    }


    public void loadData(){
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SHARED_PREFS123, Context.MODE_PRIVATE);

        checkboxSaveMonday71 = sharedPreferences.getBoolean(CHECKBOX_MONDAY71, false);
        checkboxSaveTuesday71 = sharedPreferences.getBoolean(CHECKBOX_TUESDAY71, false);
        checkboxSaveWednesday71 = sharedPreferences.getBoolean(CHECKBOX_WEDNESDAY71, false);
        checkboxSaveThursday71 = sharedPreferences.getBoolean(CHECKBOX_THURSDAY71, false);
        checkboxSaveFriday71 = sharedPreferences.getBoolean(CHECKBOX_FRIDAY71, false);
        checkboxSaveSaturday71 = sharedPreferences.getBoolean(CHECKBOX_SATURDAY71, false);


    }

    public void updateViews() {
        complete_workout_monday71.setChecked(checkboxSaveMonday71);
        complete_workout_tuesday71.setChecked(checkboxSaveTuesday71);
        complete_workout_wednesday71.setChecked(checkboxSaveWednesday71);
        complete_workout_thursday71.setChecked(checkboxSaveThursday71);
        complete_workout_friday71.setChecked(checkboxSaveFriday71);
        complete_workout_saturday71.setChecked(checkboxSaveSaturday71);

    }


    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        final int numStars = ratingBar.getNumStars();
        editor_rating = sharedPreferences_rating.edit();
        editor_rating.putFloat("float123", rating);
        editor_rating.putInt("numStars123", numStars);
        editor_rating.apply();
    }
}
