package com.example.wccstudentshowcase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mapDisplay;
    private boolean isListView = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mapDisplay = findViewById();
    }

    //when the sign in button is pressed
    public void onSignIn(View v) {
        //TODO: Check if code is valid
        setContentView(R.layout.activity_listview);
    }

    public void onClickBuilding(View v) {
        //TODO : read the id of the button pressed to tell what building should be shown

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
