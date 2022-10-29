package com.hrishi.javaBasics;

import java.util.Scanner;

public class ReadingInputs {
    public static void main(String[] args) {
        System.out.println("Reading Inputs from User Interfaces: " );
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name =sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your qualification: ");
        String occupation = sc.next();
        System.out.println("Your good name is " +name );
        System.out.println("You are " +age  + " years old") ;
        System.out.println("Your qualification is " +occupation);
    }
}
