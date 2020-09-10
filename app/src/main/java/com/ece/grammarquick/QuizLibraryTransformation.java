package com.ece.grammarquick;

public class QuizLibraryTransformation {
    private String mQuestions [] = {
            "1. Transformation means?",
            "2. Only Allah can help us (Negative)?",
            "3. He is good (Interrogative)?",
            "4. The bird is so beautiful (Exclamatory)?"
    };

    private String mChoices[][]={
            {"Sentence meaning same structure different","Sentence meaning different","Meaning Structure are different"},
            {"Nobody can help us except allah","None but allah can help us","nothing but allah can help us"},
            {"He good is?","Good is he?.","Isn't he good?"},
            {"Bird is beautiful.","how beautiful bird!","How beautiful the bird is!"}
    };
    private String mCorrectAnsers[]={"Sentence meaning same structure different", "None but allah can help us", "Isn't he good?", "How beautiful the bird is!"};

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
