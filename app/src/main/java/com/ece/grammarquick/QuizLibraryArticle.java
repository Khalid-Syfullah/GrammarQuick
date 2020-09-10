package com.ece.grammarquick;

public class QuizLibraryArticle {
    private String mQuestions [] = {
            "1. Article are____?",
            "2. 'The' article indicates?",
            "3. Which is correct?",
            "4. I have ___ Egg for the lunch."
    };

    private String mChoices[][]={
            {"A, An, The","To, At","Would, Could"},
            {"Indefinite","Definite","None of them"},
            {"I have a inkjet printer.","You are not the human.","Khalid is a good boy."},
            {"The","An","A"}
    };
    private String mCorrectAnsers[]={"A, An, The", "Definite", "Khalid is a good boy.", "An"};

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
