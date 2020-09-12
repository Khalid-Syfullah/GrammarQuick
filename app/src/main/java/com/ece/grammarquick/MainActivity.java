package com.ece.grammarquick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navdrawer_open, R.string.navdrawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        button=(Button)findViewById(R.id.startb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSentence();
            }
        });
    }
    public void openSentence(){
        Intent intent = new Intent(this,Sentence.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

                super.onBackPressed();

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.sentence) {
            Intent intent = new Intent(this,Sentence.class);
            startActivity(intent);

        } else if (id == R.id.partsofspeech) {
            Intent intent = new Intent(this,PartsOfSpeech.class);
            startActivity(intent);

        } else if (id == R.id.number) {
            Intent intent = new Intent(this, Number.class);
            startActivity(intent);

        } else if (id == R.id.gender) {
            Intent intent = new Intent(this,Gender.class);
            startActivity(intent);

        }
        else if (id == R.id.tense) {
            Intent intent = new Intent(this,Tense.class);
            startActivity(intent);
        }
        else if (id == R.id.articles) {
            Intent intent = new Intent(this,Articles.class);
            startActivity(intent);
        }
        else if (id == R.id.degree) {
            Intent intent = new Intent(this,Degree.class);
            startActivity(intent);
        }
        else if (id == R.id.voice) {
            Intent intent = new Intent(this,Voice.class);
            startActivity(intent);
        }
        else if (id == R.id.transformation) {
            Intent intent = new Intent(this,Transformation.class);
            startActivity(intent);
        }
        else if (id == R.id.resultActivity) {
            Intent intent = new Intent(this,Result.class);
            startActivity(intent);
        }

        else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
