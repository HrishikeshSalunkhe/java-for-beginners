package com.hrishi.recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal, String str){
       if(decimal ==0) {
           return str;
       }
       str = decimal % 2 + str;
        return decimalToBinary(decimal/2,str);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to DECIMAL TO BINARY Conversion using Recursion: ");
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println(Long.parseLong(decimalToBinary(sc.nextInt(), str)));
    }
}
