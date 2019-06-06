package com.example.wccstudentshowcase;

import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDataReader extends AppCompatActivity {
    //private Scanner s;
    private File studentData;
    private ArrayList<String[]> projects;


    public StudentDataReader(String fileName) throws FileNotFoundException {
        projects = new ArrayList<>();
        String s = getString(R.string.StudentData);
        //studentData = new File(getFilesDir(), fileName);
        //s = new Scanner(studentData);
        String[] strings = s.split("§");
        //grab every fifth or whatever for title, etc.
        //be sure to get the kindle working
        while(s.hasNextLine()) {
            String currentLine = s.nextLine();
            if(currentLine.contains("§")) {
                projects.add(currentLine.split("§"));
            }
        }

    }

    public ArrayList<String[]> getAllData() {
        return  projects;
    }

    public ArrayList<String> getTitles(){
        ArrayList<String> titles = new ArrayList<>();
        for(String[] s : projects) {
            titles.add(s[0]);
        }
        return titles;
    }
}
