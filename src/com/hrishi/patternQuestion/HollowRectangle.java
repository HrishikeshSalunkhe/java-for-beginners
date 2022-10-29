package com.hrishi.patternQuestion;


/**
 * @author: Hrishikesh Salunkhe
 */
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Hollow Rectangle pattern in Java:");
        //To get user input
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        System.out.println("The Required Pattern: ");
        //Outer Loop
        for (int i = 0; i < height; i++) {
            //Inner Loop
            for (int i1 = 0; i1 < width; i1++) {
                if((i==0) || (i1==0) || (i == height-1) || i1==(width-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
