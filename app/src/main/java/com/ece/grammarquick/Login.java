package com.ece.grammarquick;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private CardView rCard,lCard;
    private EditText e1,e2;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.password);
        lCard=(CardView)findViewById(R.id.loginCard);
        lCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=e1.getText().toString();
                String password=e2.getText().toString();
                Boolean chkemailpass = db.emailpassword(email,password);
                if(chkemailpass==true)
                {Toast.makeText(getApplicationContext(),"Successfully Login",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                    finish();


                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Email Or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });


        rCard=(CardView)findViewById(R.id.registrationCard);
        rCard.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.registrationCard : intent = new Intent(this, Registration.class);startActivity(intent);break;
            default:break;
        }
    }}