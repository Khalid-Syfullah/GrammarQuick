package com.ece.grammarquick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BookSelect extends AppCompatActivity {
    private Button button,button2,button3,button4;
    private long backPressedTime;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_select);

        button=(Button)findViewById(R.id.grammarBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

    }
    //backpress exit
    public void onBackPressed() {
        if(backPressedTime + 2000> System.currentTimeMillis()){
            backToast.cancel();
                super.onBackPressed();

                return;

            }
            else{
                backToast=Toast.makeText(getBaseContext(),"Press Back Again To Exit",Toast.LENGTH_SHORT);
                backToast.show();
            }
        backPressedTime = System.currentTimeMillis();
        }



    public void openMainActivity()
    {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openCbook()
    {
        Intent intent=new Intent(this, Cprogramming.class);
        startActivity(intent);
    }

    public void openCppbook()
    {
        Intent intent=new Intent(this, C_plusplus.class);
        startActivity(intent);
    }

    public void openJavabook()
    {
        Intent intent=new Intent(this, Java_Programming.class);
        startActivity(intent);
    }
}
