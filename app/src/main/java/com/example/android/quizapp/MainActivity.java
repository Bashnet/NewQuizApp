package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreCounter = 0;

    /**
     * This method is called when the submit button is clicked.
     *
     */
    public void submitQuiz(View view) {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();
        questionNine();
        questionTen();
        finalVerdict();

    }

    /**
     * This method is called to Determine where question one was answered correctly
     */
    public void questionOne() {

        RadioButton radioButton1 = findViewById(R.id.q1_b);
        boolean questionOne = radioButton1.isChecked();

        if (questionOne) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question two was answered correctly
     */
    public void questionTwo() {
        RadioButton radioButton = findViewById(R.id.q2_c);
        boolean questionTwo = radioButton.isChecked();

        if (questionTwo) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question three was answered correctly
     */
    public void questionThree() {
        CheckBox checkBox = findViewById(R.id.q3_b);
        CheckBox checkBox1 = findViewById(R.id.q3_c);
        CheckBox checkBox2 = findViewById(R.id.q3_d);
        CheckBox checkBox3 = findViewById(R.id.q3_a);

        boolean questionThree_1 = checkBox.isChecked();
        boolean questionThree_2 = checkBox1.isChecked();
        boolean questionThree_3 = checkBox2.isChecked();
        boolean questionThree_4 = checkBox3.isChecked();

        if (questionThree_1 && questionThree_2 && questionThree_3 && !questionThree_4) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question four was answered correctly
     */
    public void questionFour() {
        RadioButton radioButton = findViewById(R.id.q4_a);
        boolean questionFour = radioButton.isChecked();

        if (questionFour) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question five was answered correctly
     */
    public void questionFive() {
        RadioButton radioButton = findViewById(R.id.q5_b);
        boolean questionFive = radioButton.isChecked();

        if (questionFive) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question six was answered correctly
     */
    public void questionSix() {
        CheckBox checkBox = findViewById(R.id.q6_a);
        CheckBox checkBox1 = findViewById(R.id.q6_c);
        CheckBox checkBox2 = findViewById(R.id.q6_b);
        CheckBox checkBox3 = findViewById(R.id.q6_d);

        boolean questionSix_1 = checkBox.isChecked();
        boolean questionSix_2 = checkBox1.isChecked();
        boolean questionSix_3 = checkBox2.isChecked();
        boolean questionSix_4 = checkBox3.isChecked();

        if (questionSix_1 && questionSix_2 && !(questionSix_3 || questionSix_4)) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question seven was answered correctly
     */
    public void questionSeven() {
        RadioButton radioButton = findViewById(R.id.q7_c);
        boolean questionSeven = radioButton.isChecked();

        if (questionSeven) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question eight was answered correctly
     */
    public void questionEight() {
        RadioButton radioButton = findViewById(R.id.q8_a);
        boolean questionEight = radioButton.isChecked();

        if (questionEight) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question nine was answered correctly
     */
    public void questionNine() {
        CheckBox checkBox = findViewById(R.id.q9_b);
        CheckBox checkBox1 = findViewById(R.id.q9_c);
        CheckBox checkBox2 = findViewById(R.id.q9_d);
        CheckBox checkBox3 = findViewById(R.id.q9_a);

        boolean questionNine_1 = checkBox.isChecked();
        boolean questionNine_2 = checkBox1.isChecked();
        boolean questionNine_3 = checkBox2.isChecked();
        boolean questionNine_4 = checkBox3.isChecked();

        if (questionNine_1 && questionNine_2 && questionNine_3 && !questionNine_4) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine where question ten was answered correctly
     */
    public void questionTen() {
        EditText editText = findViewById(R.id.q10);
        String questionTen = editText.getText().toString();
        String answer = "There are three jokers";

        if (questionTen.equals(answer)) {
            scoreCounter += 1;
        }
    }

    /**
     * This method is called to Determine how many questions were answered correctly
     * and shows a toast message based on the results
     */
    public void finalVerdict() {
        int total = 10;
        String poor = getString(R.string.poor, scoreCounter, total);
        String good = getString(R.string.good, scoreCounter, total);
        String excellent = getString(R.string.excellent, scoreCounter, total);

        if (scoreCounter == total) {
            Toast.makeText(this, excellent, Toast.LENGTH_SHORT).show();
            scoreCounter = 0;
        } else if (scoreCounter >= 5) {
            Toast.makeText(this, good, Toast.LENGTH_SHORT).show();
            scoreCounter = 0;
        } else {
            Toast.makeText(this, poor, Toast.LENGTH_SHORT).show();
            scoreCounter = 0;
        }
    }
}

