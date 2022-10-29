package com.hrishi.recursion;

import java.util.Scanner;

/**
 * Class StringReversal
 * A program to print String into reverse order
 * using Recursion
 */
public class StringReversal {
    /**
     * To generate a String in reverse order
     *  @reverseString function is used
     * @param input string
     * @return returns string in reverse order after
     * making recursive calls
     */

    public static String reverseString(String input){
        if(input.equals("")){
            return "";
        }
        return reverseString(input.substring(1))+ input.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Welcome the program of string Reversal using Recursion:");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        System.out.println(reverseString(sc.nextLine()));
    }
}
