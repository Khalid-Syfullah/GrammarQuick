package com.ece.grammarquick;

public class QuizLibraryGender {
    private String mQuestions [] = {
            "1. Which is not the type of Gender?",
            "2. Gender is classified into ----- types?",
            "3. Which is Common Gender?",
            "4. Which is Neuter Gender?"
    };

    private String mChoices[][]={
            {"Masculine","Feminine","Voice"},
            {"3","5","4"},
            {"Student","Women","Cow"},
            {"Elephant","Bird","Book"}
    };
    private String mCorrectAnsers[]={"Voice", "4", "Student", "Book"};

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
