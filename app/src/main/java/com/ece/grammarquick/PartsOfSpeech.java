package com.ece.grammarquick;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class PartsOfSpeech extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_of_speech);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(PartsOfSpeech.this,Noun.class);
                startActivity(intent);
            }
        });
        FloatingActionButton fab2 = findViewById(R.id.fabMenu);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PartsOfSpeech.this,MenuSelect.class);
                startActivity(intent);
            }
        });

        b1=(Button)findViewById(R.id.noun);
        b2=(Button)findViewById(R.id.pronoun);
        b3=(Button)findViewById(R.id.verb);
        b4=(Button)findViewById(R.id.adverb);
        b5=(Button)findViewById(R.id.adjective);
        b6=(Button)findViewById(R.id.preposition);
        b7=(Button)findViewById(R.id.conjuction);
        b8=(Button)findViewById(R.id.interjection);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Noun.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Pronoun.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Verb.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Adverb.class);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Adjective.class);
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Preposition.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Conjunction.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PartsOfSpeech.this,Interjection.class);
                startActivity(intent);
            }
        });

    }

}
