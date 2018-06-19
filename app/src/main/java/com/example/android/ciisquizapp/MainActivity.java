package com.example.android.ciisquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int answeredCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        //Question 1
        RadioButton checkQuestionOne = findViewById(R.id.q1a2);
        boolean questionOneAnswer = checkQuestionOne.isChecked();
        if(questionOneAnswer) {
            answeredCorrect++;
        }

        //Question 2
        CheckBox checkQuestionTwoA = findViewById(R.id.q2a1);
        CheckBox checkQuestionTwoB = findViewById(R.id.q2a2);
        CheckBox checkQuestionTwoC = findViewById(R.id.q2a3);
        CheckBox checkQuestionTwoD = findViewById(R.id.q2a4);
        CheckBox checkQuestionTwoE = findViewById(R.id.q2a5);
        boolean questionTwoAnswer = checkQuestionTwoA.isChecked() && !checkQuestionTwoB.isChecked() && !checkQuestionTwoC.isChecked() && checkQuestionTwoD.isChecked() && !checkQuestionTwoE.isChecked();
        if (questionTwoAnswer) {
            answeredCorrect++;
        }

        //Question 3
        RadioButton checkQuestionThree = findViewById(R.id.q3a3);
        boolean questionThreeAnswer = checkQuestionThree.isChecked();
        if(questionThreeAnswer) {
            answeredCorrect++;
        }

        //Question 4
        RadioButton checkQuestionFour = findViewById(R.id.q4a4);
        boolean questionFourAnswer = checkQuestionFour.isChecked();
        if(questionFourAnswer) {
            answeredCorrect++;
        }

        //Question 5
        CheckBox checkQuestionFiveA = findViewById(R.id.q5a1);
        CheckBox checkQuestionFiveB = findViewById(R.id.q5a2);
        CheckBox checkQuestionFiveC = findViewById(R.id.q5a3);
        CheckBox checkQuestionFiveD = findViewById(R.id.q5a4);
        CheckBox checkQuestionFiveE = findViewById(R.id.q5a5);
        CheckBox checkQuestionFiveF = findViewById(R.id.q5a6);

        boolean questionFiveAnswer = !checkQuestionFiveA.isChecked() && checkQuestionFiveB.isChecked() && !checkQuestionFiveC.isChecked() && checkQuestionFiveD.isChecked() && checkQuestionFiveE.isChecked() && checkQuestionFiveF.isChecked();
        if (questionFiveAnswer) {
            answeredCorrect++;
        }

        //Question 6
        EditText questionSix = findViewById(R.id.q6a1);
        String questionSixAnswer = questionSix.getText().toString().toUpperCase();
        if (questionSixAnswer.equals("JU" +
                "DIE WEXLER")) {
            answeredCorrect++;
        }

        //Display toast messages
        if (answeredCorrect == 6) {
            Toast.makeText(this, "Congratulations! You Answered Everything Correctly", Toast.LENGTH_LONG).show();
            answeredCorrect = 0;
            return;
        } else if (answeredCorrect > 4) {
            Toast.makeText(this, "Good job! You got " + answeredCorrect + " answers right!", Toast.LENGTH_LONG).show();
            answeredCorrect = 0;
            return;
        } else if (answeredCorrect > 2) {
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
