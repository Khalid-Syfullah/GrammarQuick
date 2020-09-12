package com.ece.grammarquick;

public class QuizLibraryNumber {
    private String mQuestions [] = {
            "1. What is number?",
            "2. Number is classified into ----- types?",
            "3. Which is singular number?",
            "4. Which is plural number?"
    };

    private String mChoices[][]={
            {"Someones Name","Somethings Charecter","Numerical thing"},
            {"2","5","3"},
            {"Boys","Girls","Cow"},
            {"Student","Bird","Cats"}
    };
    private String mCorrectAnsers[]={"Numerical thing", "2", "Cow", "Cats"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer= mCorrectAnsers[a];
        return answer;
    }

    public int getLength(){return mQuestions.length;}
}
