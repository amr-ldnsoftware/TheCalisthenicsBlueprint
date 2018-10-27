package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class IntLevel2 extends AppCompatActivity {

    private static final String TAG = "INT_LEVEL2_BOSS";
    private Int2Level2Adapter mInt2Level2Adapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_int_level2);
        mInt2Level2Adapter = new Int2Level2Adapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container_int_level2);
        setupViewPager(mViewPager);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_int2);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs_int2);
        tabLayout.setupWithViewPager(mViewPager);

    //This sets the back button on the toolbar of the tabbed page
        toolbar.setNavigationIcon(R.drawable.ic_backspace);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        Int2Level2Adapter adapter = new Int2Level2Adapter(getSupportFragmentManager());
        adapter.addFragment(new IntLevel2Week1(), "Week 1");
        adapter.addFragment(new IntLevel2Week2(), "Week 2");
        adapter.addFragment(new IntLevel2Week3(), "Week 3");
        adapter.addFragment(new IntLevel2Week4(), "Week 4");
        viewPager.setAdapter(adapter);
    }
}


