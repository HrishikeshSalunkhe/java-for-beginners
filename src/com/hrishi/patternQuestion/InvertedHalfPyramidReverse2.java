package com.hrishi.patternQuestion;

import java.util.Scanner;

public class InvertedHalfPyramidReverse2 {
    public static void main(String[] args) {
        System.out.println("Inverted Half Pyramid pattern(180 deg rotation) in Java:");
        //To get user input
        Scanner sc = new Scanner(System.in);
        int heightOfPyramid = sc.nextInt();

        System.out.println("The Required Pattern: ");
        //Outer Loop
        for (int i = heightOfPyramid; i >=0 ; i--) {
            // inner loop
            for (int j = 0; j < heightOfPyramid-i; j++) {
                System.out.print(" ");
            }
            //Inner Loop
            for (int i1 = 0; i1 <= i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
