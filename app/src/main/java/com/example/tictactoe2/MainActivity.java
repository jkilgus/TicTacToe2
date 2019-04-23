package com.example.tictactoe2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton cog;
    private ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        cog = findViewById(R.id.settings);
        play = findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                play();
            }
        });

        cog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cog();
            }
        });

    }

    private void cog() {
        Intent settings = new Intent (this, Settings.class);
        startActivity(settings);
    }

    private void play() {

        Intent play = new Intent(this, Game.class);
        startActivity(play);
    }

}
