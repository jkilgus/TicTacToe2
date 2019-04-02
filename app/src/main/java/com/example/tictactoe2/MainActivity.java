package com.example.tictactoe2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        play = findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                play();
            }
        });
    }

    private void play() {

        Intent intent = new Intent(this, game.class);
        startActivity(intent);
    }

}
