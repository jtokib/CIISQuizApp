package com.example.android.ciisquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int answeredCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    * I probably wouldn't have the single function do everything, but it's 11pm and I'm running out of time so in my next version of this app I'll split up the code.
    * */
    public void submitQuiz(View view) {

        //Question 1
        RadioButton checkQuestionOne = (RadioButton) findViewById(R.id.q1a2);
        boolean questionOneAnswer = checkQuestionOne.isChecked();
        if(questionOneAnswer) {
            answeredCorrect++;
        }

        //Question 2
        CheckBox checkQuestionTwoA = (CheckBox) findViewById(R.id.q2a1);
        CheckBox checkQuestionTwoB = (CheckBox) findViewById(R.id.q2a4);
        boolean questionTwoAnswerA = checkQuestionTwoA.isChecked();
        boolean questionTwoAnswerB = checkQuestionTwoB.isChecked();
        if(questionTwoAnswerA) {
            answeredCorrect++;
        }
        if(questionTwoAnswerB) {
            answeredCorrect++;
        }

        //Question 3
        RadioButton checkQuestionThree = (RadioButton) findViewById(R.id.q3a3);
        boolean questionThreeAnswer = checkQuestionThree.isChecked();
        if(questionThreeAnswer) {
            answeredCorrect++;
        }

        //Question 4
        RadioButton checkQuestionFour = (RadioButton) findViewById(R.id.q4a4);
        boolean questionFourAnswer = checkQuestionFour.isChecked();
        if(questionFourAnswer) {
            answeredCorrect++;
        }

        //Question 5
        CheckBox checkQuestionFiveA = (CheckBox) findViewById(R.id.q5a2);
        CheckBox checkQuestionFiveB = (CheckBox) findViewById(R.id.q5a4);
        CheckBox checkQuestionFiveC = (CheckBox) findViewById(R.id.q5a5);
        CheckBox checkQuestionFiveD = (CheckBox) findViewById(R.id.q5a6);
        boolean questionFiveAnswerA = checkQuestionFiveA.isChecked();
        boolean questionFiveAnswerB = checkQuestionFiveB.isChecked();
        boolean questionFiveAnswerC = checkQuestionFiveC.isChecked();
        boolean questionFiveAnswerD = checkQuestionFiveD.isChecked();
        if(questionFiveAnswerA) {
            answeredCorrect++;
        }
        if(questionFiveAnswerB) {
            answeredCorrect++;
        }
        if(questionFiveAnswerC) {
            answeredCorrect++;
        }
        if(questionFiveAnswerD) {
            answeredCorrect++;
        }

        //Question 6
        EditText questionSix = (EditText) findViewById(R.id.q6a1);
        String questionSixAnswer = questionSix.getText().toString().toUpperCase();
        if(questionSixAnswer != null && questionSixAnswer.equals("JUDIE WEXLER")) {
            answeredCorrect++;
        }

        //Display toast messages
        if (answeredCorrect == 10) {
            Toast.makeText(this, "Congratulations! You Answered Everything Correctly", Toast.LENGTH_LONG).show();
            answeredCorrect = 0;
            return;
        } else if (answeredCorrect > 7) {
            Toast.makeText(this, "Good job! You got " + answeredCorrect + " answers right!", Toast.LENGTH_LONG).show();
            answeredCorrect = 0;
            return;
        } else if (answeredCorrect > 4) {
            Toast.makeText(this, "Not bad. You got " + answeredCorrect + " answers right. Try learning more about us online.", Toast.LENGTH_LONG).show();
            answeredCorrect = 0;
            return;
        } else {
            Toast.makeText(this, "Nice Try. You got " + answeredCorrect + " answers right. It looks like you could brush up on your CIIS knowledge.", Toast.LENGTH_LONG).show();
            answeredCorrect = 0;
            return;
        }
    }
}
