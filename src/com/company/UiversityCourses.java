package com.company;

import java.util.ArrayList;
import java.util.List;

public class UiversityCourses {
    private String course;
    private List<String> students =new ArrayList<>();
    private String instuctor;

    UiversityCourses(String courseName,String instructorName){
        if(courseName.matches("^[a-zA-Z\\s]+"))
            this.course=courseName;

        if(instructorName.matches("^[a-zA-Z\\s]+"))
            instuctor=instructorName;
    }
    public void register(String StudentName){
        students.add(StudentName);
    }
    public void drop(String StudentName){
        if(students.indexOf(StudentName)!=-1)
            students.remove(StudentName);
        else throw new IllegalArgumentException("your argument is invalid");
    }

}
