package com.hrishi.recursion;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isStringPalindrome(String input){
        if(input.length() ==0 || input.length() ==1){
            return true;
        }
        if(input.charAt(0) == input.charAt((input.length())-1)){
            return isStringPalindrome(input.substring(1,input.length()-1));
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to String Palindrome using Recursion");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check for Palindrome");
        System.out.println("The given string is Palindrome (true/false): " +isStringPalindrome(sc.next()));
    }
}
