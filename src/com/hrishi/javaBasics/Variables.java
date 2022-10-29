package com.hrishi.javaBasics;

import java.util.Date;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Variables in Java");

        // Primitive Data Types
        char name = 'A';
        int age=26;
        float gpa= 7.18f;
        double percentage = 77.77;
        boolean isAdult= true;
        System.out.println(name);
        System.out.println(age);
        System.out.println(gpa);
        System.out.println(percentage);
        System.out.println(isAdult);

        // Reference Type
        Date now= new Date();
        String langName ="Java Development Kit(JDK)";
        System.out.println(now);
        System.out.println(langName);
    }
}
