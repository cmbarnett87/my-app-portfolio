package com.cbarnett.corey.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AppPortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_portfolio, menu);
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


    //Button Clicks
    public void btnAppPortFolioAllClick(View view) {
        Button btnClicked = (Button) view;
        String strAppName = btnClicked.getText().toString();
        Toast t = Toast.makeText(getApplicationContext(), String.format("%s is coming soon!",strAppName), Toast.LENGTH_LONG);
        t.show();
    }

    //Just in case we need a function for each
/*
     public void btnSpotifyStreamerClick(View view){
        Toast t = Toast.makeText(getApplicationContext(),"Spotify Stream is coming soon!",Toast.LENGTH_LONG);
        t.show();
    }
    public void btnScoresAppClick(View view){
        Toast t = Toast.makeText(getApplicationContext(),"Spotify Stream is coming soon!",Toast.LENGTH_LONG);
        t.show();
    }

    public void btnSpotifyStreamerClick(View view){
        Toast t = Toast.makeText(getApplicationContext(),"Spotify Stream is coming soon!",Toast.LENGTH_LONG);
        t.show();
    }

    public void btnSpotifyStreamerClick(View view){
        Toast t = Toast.makeText(getApplicationContext(),"Spotify Stream is coming soon!",Toast.LENGTH_LONG);
        t.show();
    }

    public void btnSpotifyStreamerClick(View view){
        Toast t = Toast.makeText(getApplicationContext(),"Spotify Stream is coming soon!",Toast.LENGTH_LONG);
        t.show();
    }

    public void btnSpotifyStreamerClick(View view){
        Toast t = Toast.makeText(getApplicationContext(),"Spotify Stream is coming soon!",Toast.LENGTH_LONG);
        t.show();
    }*/


}
