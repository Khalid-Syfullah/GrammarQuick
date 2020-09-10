package com.ece.grammarquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivityArticle extends AppCompatActivity {

    public QuizLibraryArticle mQuestionLibrary = new QuizLibraryArticle();
    public TextView mScoreView;
    public TextView mQuestionView;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public Button nextTopic;

    public String mAnswer;
    public int mScore=0;
    public int mQuestionNumber=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_gender);

        mScoreView=(TextView)findViewById(R.id.score);
        mQuestionView=(TextView)findViewById(R.id.question);
        mButtonChoice1=(Button)findViewById(R.id.choice1);
        mButtonChoice2=(Button)findViewById(R.id.choice2);
        mButtonChoice3=(Button)findViewById(R.id.choice3);

        updateQuestion();
        nextTopic=(Button)findViewById(R.id.nextTopic);
        nextTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuizActivityArticle.this,Degree.class);
                startActivity(intent);
            }
        });

        //start button listener code here for button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for button goes here
                if(mButtonChoice1.getText()==mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code here
                    Toast.makeText(QuizActivityArticle.this,"Correct!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(QuizActivityArticle.this,"Wrong!! Correct Answer : "+mAnswer,Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //end of button listener for button1

        //start button listener code here for button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for button goes here
                if(mButtonChoice2.getText()==mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //optional code here
                    Toast.makeText(QuizActivityArticle.this,"Correct!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(QuizActivityArticle.this,"Wrong!! Correct Answer : "+mAnswer,Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //end of button listener for button2

        //start button listener code here for button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logic for button goes here
                if(mButtonChoice3.getText()==mAnswer){
                    mScore = mScore + 1;

                    updateScore(mScore);
                    updateQuestion();
                    //optional code here
                    Toast.makeText(QuizActivityArticle.this,"Correct!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(QuizActivityArticle.this,"Wrong!! Correct Answer : "+mAnswer,Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //end of button listener for button3
    }
    private void updateQuestion(){
        if(mQuestionNumber<mQuestionLibrary.getLength()) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else{
            Toast.makeText(QuizActivityArticle.this, "Test is Over", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(QuizActivityArticle.this,Degree.class);
            startActivity(intent);
        }
    }
int count;
    public void updateScore(int point){
        mScoreView.setText(""+mScore);
        count=mScore;

    }
}
