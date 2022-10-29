package com.hrishi.recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int inputNumber){
        if(inputNumber == 1){
            return inputNumber =1;
        }
        return sumOfNaturalNumbers(inputNumber-1) + inputNumber;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Of natural Numbers using Recursion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Natural Number: ");
        System.out.println(sumOfNaturalNumbers(sc.nextInt()));

    }
}
