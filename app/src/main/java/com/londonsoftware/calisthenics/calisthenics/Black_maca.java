package com.londonsoftware.calisthenics.calisthenics;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.a_m_e.thecalisthenicsblueprint.R;

public class Black_maca extends AppCompatActivity {
    Dialog dialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.black_maca);
        dialog = new Dialog(this);



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

    public void ShowPopup_maca (View v) {
        TextView closetext;
        dialog.setContentView(R.layout.popup_maca_powder_macros);
        closetext = dialog.findViewById(R.id.exit_popup_macapowder);

        closetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    public void ShowPopupNutrition_maca (View v) {
        TextView closetext;
        dialog.setContentView(R.layout.popup_maca_powder_nutrition);
        closetext = dialog.findViewById(R.id.exit_popup_maca_nutrition);

        closetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}

