package com.ece.grammarquick;

public class QuizLibraryDegree {

    private String mQuestions [] = {
            "1. Degree works with____?",
            "2. Degree mainly classified into ----- types?",
            "3. Which is Superlative Degree?",
            "4. Which Sentence in Positive Degree"
    };

    private String mChoices[][]={
            {"Noun","Verb","Adjective"},
            {"5","3","4"},
            {"Good","Best","Better"},
            {"He is as good as his brother.","I am smarter than you.","He is the best of all."}
    };
    private String mCorrectAnsers[]={"Adjective", "3", "Best", "He is as good as his brother."};

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
