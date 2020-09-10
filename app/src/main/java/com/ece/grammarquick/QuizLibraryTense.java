package com.ece.grammarquick;

public class QuizLibraryTense {
    private String mQuestions [] = {
            "1. Tense refers to____?",
            "2. Tense mainly classified into ----- types?",
            "3. Which is Present Continous Tense?",
            "4. Here Past perfect is : "
    };

    private String mChoices[][]={
            {"Time","Name","Character"},
            {"5","3","4"},
            {"I am eating rice.","He had gone to school.","Rahim is a good boy."},
            {"He is a student.","I ate too much.","I had gone to market."}
    };
    private String mCorrectAnsers[]={"Time", "3", "I am eating rice.", "I had gone to market."};

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
