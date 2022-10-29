package com.hrishi.patternQuestion;

import java.util.Scanner;

/**
 * @author: Hrishikesh Salunkhe
 */
public class SolidRectangle {
    public static void main(String[] args) {
        System.out.println("Solid Rectangle pattern in Java:");
        //To get user input
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        System.out.println("The Required Pattern: ");
        //Outer Loop
        for (int i = 0; i < height; i++) {
            //Inner Loop
            for (int i1 = 0; i1 < width; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
