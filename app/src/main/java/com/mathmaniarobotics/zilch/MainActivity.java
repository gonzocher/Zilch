package com.mathmaniarobotics.zilch;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays a scorekeeper for the Zilch game.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Set variable for score to zero at beginning of game.
     */

    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the add buttons in player 1 are clicked.
     * addScore will add the button amount (like +50) to the sum.
     */
    public void add1Score50(View view) {
        score1 = score1 + 50;
        display1(score1);
    }

    public void add1Score100(View view) {
        score1 = score1 + 100;
        display1(score1);
    }

    public void add1Score1000(View view) {
        score1 = score1 + 1000;
        display1(score1);
    }

    /**
     * This method displays the sum in score1 on the screen.
     */
    private void display1(int number) {
        TextView quantityTextView1 = (TextView) findViewById(R.id.score1);
        quantityTextView1.setText("" + number);
    }

    /**
     * This method is called when the add buttons in player 2 are clicked.
     * addScore will add the button amount (like +50) to the sum.
     */
    public void add2Score50(View view) {
        score2 = score2 + 50;
        display2(score2);
    }

    public void add2Score100(View view) {
        score2 = score2 + 100;
        display2(score2);
    }

    public void add2Score1000(View view) {
        score2 = score2 + 1000;
        display2(score2);
    }

    /**
     * This method displays the sum in score2 on the screen.
     */
    private void display2(int number) {
        TextView quantityTextView2 = (TextView) findViewById(R.id.score2);
        quantityTextView2.setText("" + number);
    }

    /**
     * This method is called when the add buttons in player 3 are clicked.
     * addScore will add the button amount (like +50) to the sum.
     */
    public void add3Score50(View view) {
        score3 = score3 + 50;
        display3(score3);
    }

    public void add3Score100(View view) {
        score3 = score3 + 100;
        display3(score3);
    }

    public void add3Score1000(View view) {
        score3 = score3 + 1000;
        display3(score3);
    }

    /**
     * This method displays the sum in score1 on the screen.
     */
    private void display3(int number) {
        TextView quantityTextView3 = (TextView) findViewById(R.id.score3);
        quantityTextView3.setText("" + number);
    }

    /**
     * This method is called when the add buttons in player 4 are clicked.
     * addScore will add the button amount (like +50) to the sum.
     */
    public void add4Score50(View view) {
        score4 = score4 + 50;
        display4(score4);
    }

    public void add4Score100(View view) {
        score4 = score4 + 100;
        display4(score4);
    }

    public void add4Score1000(View view) {
        score4 = score4 + 1000;
        display4(score4);
    }

    /**
     * This method displays the sum in score4 on the screen.
     */
    private void display4(int number) {
        TextView quantityTextView4 = (TextView) findViewById(R.id.score4);
        quantityTextView4.setText("" + number);
    }

}



