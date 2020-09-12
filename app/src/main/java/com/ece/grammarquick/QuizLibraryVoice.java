package com.ece.grammarquick;

public class QuizLibraryVoice {
    private String mQuestions [] = {
            "1. Voice indicates?",
            "2. Voice mainly classified into ----- types?",
            "3. Which is Active Voice?",
            "4. Which Sentence is Passive Voice?"
    };

    private String mChoices[][]={
            {"whether subject does the work or not","Tense in a sentence","Length Of a sentence"},
            {"5","2","4"},
            {"I have eaten rice","Football is being played by me.","The Work is done by them"},
            {"Rahim writes a letter","Go to market","This pc is owned by me."}
    };
    private String mCorrectAnsers[]={"whether subject does the work or not", "2", "I have eaten rice", "This pc is owned by me."};

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
