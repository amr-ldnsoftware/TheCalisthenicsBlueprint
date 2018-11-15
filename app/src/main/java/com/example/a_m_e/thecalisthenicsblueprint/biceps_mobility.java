package com.example.a_m_e.thecalisthenicsblueprint;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class biceps_mobility extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    Button button;
    YouTubePlayer.OnInitializedListener onInitializedListener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bicep_mobility);

        button = findViewById(R.id.button_play_frontlever);
        youTubePlayerView = findViewById(R.id.frontlever_youtubePlay);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                youTubePlayer.loadVideo("nEQQle9-0NA");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize(YoutubeConfig.getApiKey(), onInitializedListener);
            }
        });

    }



}