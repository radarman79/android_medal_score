package com.example.android.olympicmedalweightedscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app keeps track of the indexed medal score score for 2 Countries.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Tracks the score for Country A
    int scoreCountryA = 0;

    // Tracks the score for Country B
    int scoreCountryB = 0;

    /**
     * Increase the score for Country A by 1 point.
     */
    public void addOneForCountryA(View v) {
        scoreCountryA = scoreCountryA + 1;
        displayForCountryA(scoreCountryA);
    }

    /**
     * Increase the score for Country A by 3 points.
     */
    public void addThreeForCountryA(View v) {
        scoreCountryA = scoreCountryA + 3;
        displayForCountryA(scoreCountryA);
    }

    /**
     * Increase the score for Country A by 5 points.
     */
    public void addFiveForCountryA(View v) {
        scoreCountryA = scoreCountryA + 5;
        displayForCountryA(scoreCountryA);
    }

    /**
     * Increase the score for Country B by 1 point.
     */
    public void addOneForCountryB(View v) {
        scoreCountryB = scoreCountryB + 1;
        displayForCountryB(scoreCountryB);
    }

    /**
     * Increase the score for Country B by 3 points.
     */
    public void addThreeForCountryB(View v) {
        scoreCountryB = scoreCountryB + 3;
        displayForCountryB(scoreCountryB);
    }

    /**
     * Increase the score for Country B by 5 points.
     */
    public void addFiveForCountryB(View v) {
        scoreCountryB = scoreCountryB + 5;
        displayForCountryB(scoreCountryB);
    }

    /**
     * Resets the score for both Countries back to 0.
     */
    public void resetScore(View v) {
        scoreCountryA = 0;
        scoreCountryB = 0;
        displayForCountryA(scoreCountryA);
        displayForCountryB(scoreCountryB);
    }

    /**
     * Displays the medal score for Country A.
     */
    public void displayForCountryA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.country_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the medal score for Country B.
     */
    public void displayForCountryB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.country_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
