package com.udacity.jlundy.mainapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MenuActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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

    public void startSpotifyApp(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Starting Spotify Streamer App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void startScoresApp(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Starting Football Scores App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void startLibraryApp(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Starting Library App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void startBuildItApp(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Starting Built It Bigger App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void startXYZApp(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Starting XYZ Reader App!", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void startMyApp(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Starting My Captsone App!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
