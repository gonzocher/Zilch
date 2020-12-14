package com.mathmaniarobotics.zilch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.ToggleButton;

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
    int score5 = 0;

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

    /**
     * This method is called when the add buttons in player 5 are clicked.
     * addScore will add the button amount (like +50) to the sum.
     */
    public void add5Score50(View view) {
        score5 = score5 + 50;
        display5(score5);
    }

    public void add5Score100(View view) {
        score5 = score5 + 100;
        display5(score5);
    }

    public void add5Score1000(View view) {
        score5 = score5 + 1000;
        display5(score5);
    }

    /**
     * This method displays the sum in score1 on the screen.
     */
    private void display5(int number) {
        TextView quantityTextView5 = (TextView) findViewById(R.id.score5);
        quantityTextView5.setText("" + number);
    }

    /**
     * This method banks the score gained during one turn.  Or just one method to bank the row?
     * Doesn't work yet
     */
    private void bank1(int number) {
        TextView quantityTextView1 = (TextView) findViewById(R.id.totalPlayer1);
        quantityTextView1.setText("" + number);
    }

    public void bank2(View view) {

    }

    public void bank3(View view) {

    }

    public void bank4(View view) {

    }

    public void bank5(View view) {

    }

    /**
     * This method resets the toggle buttons
     */
    private void resetToggle1() {
        ToggleButton toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton1.setChecked(false);
    }

    private void resetToggle2() {
        ToggleButton toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        toggleButton2.setChecked(false);
    }

    private void resetToggle3() {
        ToggleButton toggleButton3 = (ToggleButton) findViewById(R.id.toggleButton3);
        toggleButton3.setChecked(false);
    }

    private void resetToggle4() {
        ToggleButton toggleButton4 = (ToggleButton) findViewById(R.id.toggleButton4);
        toggleButton4.setChecked(false);
    }

    private void resetToggle5() {
        ToggleButton toggleButton5 = (ToggleButton) findViewById(R.id.toggleButton5);
        toggleButton5.setChecked(false);
    }

    /**
     * This method adds another player to the table. Make this so that it adds "another" row instead just making visible row 5
     */
    public void addPlayer(View view) {
        TableRow row5 = (TableRow)
                findViewById(R.id.row5);
        row5.setVisibility(View.VISIBLE);
    }

    /**
     * This method resets all scores back to zero.
     */
    public void resetScores(View view) {
        score1 = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        score5 = 0;
        display1(score1);
        display2(score2);
        display3(score3);
        display4(score4);
        display5(score5);
        resetToggle1();
        resetToggle2();
        resetToggle3();
        resetToggle4();
        resetToggle5();
    }

    /**
     * This method displays the sum so far for the turn, in the bottom message.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.textViewBottom);
        priceTextView.setText(message);
    }
}