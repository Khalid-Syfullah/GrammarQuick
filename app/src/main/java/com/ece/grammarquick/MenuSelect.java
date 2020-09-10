package com.ece.grammarquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuSelect extends AppCompatActivity {
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_select);
        b0=(Button)findViewById(R.id.homeButton);
        b1=(Button)findViewById(R.id.sentenceButton);
        b2=(Button)findViewById(R.id.partofspeechButton);
        b3=(Button)findViewById(R.id.numberButton);
        b4=(Button)findViewById(R.id.genderButton);
        b5=(Button)findViewById(R.id.tenseButton);
        b6=(Button)findViewById(R.id.articleButton);
        b7=(Button)findViewById(R.id.degreeButton);
        b8=(Button)findViewById(R.id.voiceButton);
        b9=(Button)findViewById(R.id.transformationButton);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,BookSelect.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Sentence.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,PartsOfSpeech.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Number.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Gender.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Tense.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Articles.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Degree.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Voice.class);
                startActivity(intent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuSelect.this,Transformation.class);
                startActivity(intent);
            }
        });
    }
}
