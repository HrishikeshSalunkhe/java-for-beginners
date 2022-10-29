package com.hrishi.javaBasics;

public class ForLoops {
    public static void main(String[] args) {
        System.out.println("Loops in Java");
        // For Loops
        // for(initialization;condition;increment/decrement)
        for(int i =0;i<5 ; ++i){
            System.out.println("Hello World");
        }

        // While Loops
        int i =5; //initialization
        while (i>0){    //condition
            System.out.println("Welcome to While Loop");
            --i; // decrement
        }

        // Do-While Loops
        // Execute at least one time
        int j =5; //initialization
        do{    //condition
            System.out.println("You are in Do-While Loop");
            --j; // decrement
        }while (j>0);

        //for each
        // Used to iterate over Arrays and Collections

        String fruits[] ={"Apple", "Mango","Orange"};
        for( i =0 ;i<fruits.length ; ++i){
            System.out.println(fruits[i]);
        }
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
