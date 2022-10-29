package com.hrishi.patternQuestion;

import java.util.Scanner;

public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        System.out.println("Inverted Half Pyramid with Number in Java: ");
        Scanner sc = new Scanner(System.in);
        int heightOfPyramid = sc.nextInt();

        //Outer Loop
        for (int i = heightOfPyramid; i >=0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
