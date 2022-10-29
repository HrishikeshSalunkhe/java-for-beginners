package com.hrishi.patternQuestion;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Inverted Half Pyramid pattern in Java:");
        //To get user input
        Scanner sc = new Scanner(System.in);
        int heightOfPyramid = sc.nextInt();

        System.out.println("The Required Pattern: ");
        //Outer Loop
        for (int i = heightOfPyramid-1; i >= 0; i--) {
            //Inner Loop
            for (int i1 = 0; i1 <= i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
