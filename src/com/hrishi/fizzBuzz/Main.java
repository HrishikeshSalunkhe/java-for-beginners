package com.hrishi.fizzBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fizz Buzz App in java");
        Scanner sc  = new Scanner(System.in);
        int elementToCheck = sc.nextInt();
        boolean divByFive = (elementToCheck %5 ==0);
        boolean divByThree = (elementToCheck %3 ==0);
        if(divByFive && divByThree){
            System.out.println("FizzBuzz");
        }
        else if(divByFive){
            System.out.println("Fizz");
        }
        else if (divByThree){
            System.out.println("Buzz");
        }
        else{
            System.out.println(elementToCheck);
        }

    }
}
