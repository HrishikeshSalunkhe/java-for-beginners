package com.hrishi.javaBasics;

public class ControlFlows {
    public static void main(String[] args) {
        System.out.println("Control Flow Statements in Java");
        int temp = 37;
        if(temp>30 ){
            System.out.println("It's Hot day");
            System.out.println("Drink plenty of Water ");

        }

        else  if(temp >20 && temp < 31){
            System.out.println("It's a good day");
        }
        else {
            System.out.println("Cold Day!");
        }
    }
}
