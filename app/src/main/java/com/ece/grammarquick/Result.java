package com.ece.grammarquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    public QuizActivityArticle article = new QuizActivityArticle();
    public TextView articleText;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
       b=(Button)findViewById(R.id.homeB);
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Result.this,BookSelect.class);
               startActivity(intent);
           }
       });
    }
}
