package com.example.wccstudentshowcase;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mapDisplay;
    private Drawable syref1;
    private boolean isListView = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mapDisplay = findViewById(R.id.mapDisplay);
        //mapDisplay.
    }

    //when the sign in button is pressed
    public void onSignIn(View v) {
        //TODO: Check if code is valid
        setContentView(R.layout.activity_listview);
    }

    public void onClickBuilding(View v) {
        //TODO : read the id of the button pressed to tell what building should be shown
        //TODO : when a building is clicked, pull up a list of events in that building
        switch(v.getId())
        {
            case R.id.heiner:
                break;
            case R.id.cascade:
                break;
            case R.id.syre:
                break;
        }
        String s = v.getId()  + "";
        Log.d("stuff", s);
    }

    public void onToggleView(View v) {
        //flip the state between list and map view
        isListView = !isListView;
        if(isListView)
        {
            setContentView(R.layout.activity_listview);
        }
        else
        {
            setContentView(R.layout.activity_mapview);
        }
    }
}
