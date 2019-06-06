package com.example.wccstudentshowcase;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ViewList extends AppCompatActivity {

        RecyclerViewAdapter adapter;


        @Override
        protected void onCreate(Bundle savedInstanceState)  {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_listview);

            // set up the RecyclerView
            RecyclerView recyclerView = findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            ArrayList<String> dataList;
            StudentDataReader reader = null;
            try {
                reader = new StudentDataReader("data1 (updated).txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            dataList = reader.getTitles();

            adapter = new RecyclerViewAdapter(this, dataList);
            //adapter.setClickListener(this);
            recyclerView.setAdapter(adapter);


        }
}
