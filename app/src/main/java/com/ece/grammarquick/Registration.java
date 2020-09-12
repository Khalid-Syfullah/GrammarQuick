package com.ece.grammarquick;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity{
    DatabaseHelper db;
    private EditText e1,e2,e3;
    private CardView registerCard,regLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        db=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.password);
        e3=(EditText)findViewById(R.id.confirmPassword);
        registerCard=(CardView)findViewById(R.id.clickToregistrationCard);
        regLogin=(CardView)findViewById(R.id.clickToLoginCard);
        regLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Registration.this,Login.class);
                startActivity(intent);
            }
        });
        registerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")){
                    Toast.makeText(getApplicationContext(),"Fields Are Empty",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(s2.equals(s3)){
                        Boolean chkemail=db.chkemail(s1);
                        if(chkemail==true){
                            Boolean insert =db.insert(s1,s2);
                            if(insert==true){
                                Toast.makeText(getApplicationContext(),"Registerd Succesfully",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(Registration.this,BookSelect.class);
                                startActivity(intent);
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Email Already Exists",Toast.LENGTH_LONG).show();
                        }
                    }
                   else
                       Toast.makeText(getApplicationContext(),"Password Not Matched!! Try Again",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


}
