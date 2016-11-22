package com.example.lee.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Testing: ";
    private int buttonState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.d(TAG, "My debug message");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                android.widget.TextView helloText = (android.widget.TextView) findViewById(R.id.helloText);
                helloText.setText("something");


            }

        });

        Button theButton = (Button) findViewById(R.id.theButton);
        theButton.setBackgroundColor(Color.RED);
        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button theButton = (Button) findViewById(R.id.theButton);
                if((buttonState % 2) == 0) {

                    theButton.setBackgroundColor(Color.RED);
                }
                else{

                    theButton.setBackgroundColor(Color.BLUE);
                }

                buttonState++;
            }
        });
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
}
