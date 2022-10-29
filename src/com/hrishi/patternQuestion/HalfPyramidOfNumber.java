package com.hrishi.patternQuestion;

import java.util.Scanner;

public class HalfPyramidOfNumber {
    public static void main(String[] args) {
        System.out.println("Half Pyramid with Number in Java: ");
        Scanner sc = new Scanner(System.in);
        int heightOfPyramid = sc.nextInt();
        
        //Outer Loop
        for (int i = 1; i <= heightOfPyramid; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
