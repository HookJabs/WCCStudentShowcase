package com.example.wccstudentshowcase;

//import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StudentDataReader extends AppCompatActivity {
    //private Scanner s;
    private File studentData;
    private String[] allData;
    private String[] titles;


    public StudentDataReader() {

        String s = getString(R.string.StudentData);
        //studentData = new File(getFilesDir(), fileName);
        //s = new Scanner(studentData);
        allData = s.split("§");
        //grab every fifth or whatever for title, etc.
        titles = new String[allData.length/5];
        int j  = 0;
        for (int i = 0; i < allData.length; i+=5) {
            titles[j] = allData[i];
            j++;
        }


    }

    public String[] getAllData() {
        return allData;
    }

    public String[] getTitles(){
        return titles;
    }
}
