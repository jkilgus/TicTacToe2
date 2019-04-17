package com.example.tictactoe2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class game extends AppCompatActivity {
    private Button exit;
    private ImageButton one;
    private ImageButton two;
    private ImageButton three;
    private ImageButton four;
    private ImageButton five;
    private ImageButton six;
    private ImageButton seven;
    private ImageButton eight;
    private ImageButton nine;


    // Setup game

    // 2 = nobody played that square yet
    // 1 = X played
    // 0 = O played
    private int[] game = {2,2,2,2,2,2,2,2,2};
    private ImageButton[] numbers = {one,two,three,four,five,six,seven,eight,nine};

    // If its you're turn
    private boolean turn = true;

    // If the game is running
    private boolean run = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);



        exit = findViewById(R.id.exit);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                one.setBackgroundResource(R.drawable.x);
                turn = false;
                game[1] = 1;
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                two.setBackgroundResource(R.drawable.x);
                turn = false;
                game[2] = 1;
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                three.setBackgroundResource(R.drawable.x);
                turn = false;
                game[3] = 1;
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                four.setBackgroundResource(R.drawable.x);
                turn = false;
                game[4] = 1;
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                five.setBackgroundResource(R.drawable.x);
                turn = false;
                game[5] = 1;
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                six.setBackgroundResource(R.drawable.x);
                turn = false;
                game[6] = 1;
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seven.setBackgroundResource(R.drawable.x);
                turn = false;
                game[7] = 1;
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eight.setBackgroundResource(R.drawable.x);
                turn = false;
                game[8] = 1;
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nine.setBackgroundResource(R.drawable.x);
                turn = false;
                game[0] = 1;
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }


        private void computerGo() {
                while (!turn) {
                    for (int i = 0; i <= 8; i++) {
                        if (game[i] == 2) {
                            game[i] = 0;
                            numbers[i].setBackgroundResource(R.drawable.o);
                            turn = true;
                        }
                    }
                }

        }





    }