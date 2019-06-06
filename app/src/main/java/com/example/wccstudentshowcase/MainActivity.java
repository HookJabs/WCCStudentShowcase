package com.example.wccstudentshowcase;

import android.graphics.drawable.Drawable;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    private ImageView mapDisplay;
    private Drawable syref1;
    private boolean isListView = true;
//    private MyRecyclerViewAdapter adapter;
    private StudentDataReader sdr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mapDisplay = findViewById(R.id.mapDisplay);
        sdr = new StudentDataReader();
//        recyclerViewStuff();
        //mapDisplay.
    }
    public void recyclerViewStuff() {

        //System.out.println(sdr.getTitles());
        // data to populate the RecyclerView with
        ArrayList<String> titles = new ArrayList<>();
//        String[] titleArray = sdr.getTitles();
//        for(String s : titleArray) {
//            titles.add(s);
//        }

        // set up the RecyclerView
//        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        adapter = new MyRecyclerViewAdapter(this, titles);
//        adapter.setClickListener(this);
//        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
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
