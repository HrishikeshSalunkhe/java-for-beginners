package com.hrishi.classroomProject;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: Hrishikesh Salunkhe
 */
public class ClassRoom {
    String buildingName;
    String roomName;
    ArrayList<Student> students;
    Seat[][] seats;
    public ClassRoom(String buildingName, String roomName,int rows, int cols){
            this.buildingName = buildingName;
            this.roomName = roomName;
            this.seats = new Seat[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat(i,j);
            }
        }
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void assignStudentSeat(Student student){
            int rows = this.seats.length;
            int columns = this.seats[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(this.seats[i][j].studentInSeat == null){
                    this.seats[i][j].assignStudentInSeat(student);
                    return;
                }
            }
        }
    }

    public void printAllStudents(){
        System.out.println("Student In Class: ");
        for (Student student: this.students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        String s= "\n";
        int rows = this.seats.length;
        int columns = this.seats[0].length;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                s = s +this.seats[i][j] + "\t";
            }
            s+="\n";
        }
        
        return s;
    }

    public static void main(String[] args) {
        //Create class for Btech Class
        ClassRoom  btech = new ClassRoom("CSE","201",3,5);

        //Create Students to add in class
        Student rohan = new Student("Rohan","1603001");
        Student sumit = new Student("Sumit","1603002");
        Student shubham = new Student("Shubham","1603003");
        Student animesh = new Student("Animesh","1603004");

        //Add Students to Classrom
        btech.addStudent(rohan);
        btech.addStudent(sumit);
        btech.addStudent(shubham);
        btech.addStudent(animesh);

        //Assign seats to students in class
        btech.assignStudentSeat(rohan);
        btech.assignStudentSeat(sumit);
        btech.assignStudentSeat(shubham);
        btech.assignStudentSeat(animesh);

        //Print List of students in Class
        btech.printAllStudents();

        //Print Classroom class itself
        System.out.println(btech);
    }

}
