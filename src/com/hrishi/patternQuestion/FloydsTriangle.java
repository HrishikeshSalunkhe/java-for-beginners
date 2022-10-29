package com.hrishi.patternQuestion;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.println("Floyd's Triangle in Java: ");
        Scanner sc = new Scanner(System.in);
        int heightOfTriangle = sc.nextInt();
        int count =1;
        for (int i = 0; i < heightOfTriangle; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }
}
