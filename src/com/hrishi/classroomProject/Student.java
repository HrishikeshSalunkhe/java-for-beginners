package com.hrishi.classroomProject;

public class Student {
    String name;
    String ID;
    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return  this.name;
    }
}
