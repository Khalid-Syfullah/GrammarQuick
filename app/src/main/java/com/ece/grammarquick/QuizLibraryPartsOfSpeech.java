package com.ece.grammarquick;

public class QuizLibraryPartsOfSpeech {
    private String mQuestions [] = {
            "1. Parts Of Speech are______ types?",
            "2. Here Noun is : ",
            "3. Which Parts Of Speech is used instead of Noun?",
            "4. What is Verb?"
    };

    private String mChoices[][]={
            {"8","7","5"},
            {"Are","Good","Seikh Mujibur Rahman"},
            {"Verb","Adjective","Pronoun"},
            {"Any kind of name","To Do something","Connectors"}
    };
    private String mCorrectAnsers[]={"8", "Seikh Mujibur Rahman", "Pronoun", "To Do something"};

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
