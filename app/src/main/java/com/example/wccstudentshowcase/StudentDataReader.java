package com.example.wccstudentshowcase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDataReader {
    private Scanner s;
    private File studentData;
    private ArrayList<String[]> projects;


    public StudentDataReader(String fileName) throws FileNotFoundException {
        projects = new ArrayList<>();
        studentData = new File(fileName);
        s = new Scanner(studentData);
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
