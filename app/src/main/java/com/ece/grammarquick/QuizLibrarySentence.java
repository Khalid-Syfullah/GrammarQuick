package com.ece.grammarquick;

public class QuizLibrarySentence {
    private String mQuestions [] = {
            "1. Sentence Are______ types?",
            "2. Here interrogative sentence is : ",
            "3. Which symbol we use to express exclamatory sentence?",
            "4. Which is not sentence type? "
    };

    private String mChoices[][]={
            {"2","3","5"},
            {"I am happy.","How are you?","We are human."},
            {"?","!",","},
            {"Assertive","Optative","Active voice"}
    };
    private String mCorrectAnsers[]={"5", "How are you?", "!", "Active voice"};

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
