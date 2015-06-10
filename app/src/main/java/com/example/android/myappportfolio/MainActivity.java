package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /** Called when the user touches the score button */
    public void scoreAction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will open the score app when complete";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the library button */
    public void libraryAction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will open the library app when complete";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }/** Called when the user touches the xyz button */
    public void xyzAction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will open the xyz reader app when complete";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }/** Called when the user touches the Build It button */
    public void buildItAction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will open the Build It app when complete";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }/** Called when the user touches the capstone button */
    public void capstoneAction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will open the capstone app when complete";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }/** Called when the user touches the spotify button */
    public void spotifyAction(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This will open the spotify app when complete";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
