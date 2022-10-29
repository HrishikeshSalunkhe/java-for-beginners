package com.hrishi.patternQuestion;

import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        System.out.println("Floyd's Triangle in Java: ");
        Scanner sc = new Scanner(System.in);
        int heightOfTriangle = sc.nextInt();
        int count =1;
        for (int i = 0; i < heightOfTriangle; i++) {
            for (int j = 0; j <= i ; j++) {
                if((i+j)%2==0){
                    System.out.print(1+ " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
