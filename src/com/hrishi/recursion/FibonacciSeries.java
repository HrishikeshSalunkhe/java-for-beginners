package com.hrishi.recursion;

import java.util.Scanner;

/**
 * @author: Hrishikesh Salunkhe
 */


public class FibonacciSeries {
    /**
     * fibonacciSeries function will return a number at the given
     * position in fibonacci series
     * fibonacci series: 1,1,2,3,5,8,13...
     * e.g if we pass number 5 then it returns 5
     *
     * @param number position of fibonacci number we want to retrieve
     * @return returns the number at given position
     */
    public static long fibonacciSeries(long number){
        if(number <=1){
            return number;
        }
        return fibonacciSeries(number-1)+fibonacciSeries(number-2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Series using Recursion:");
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacciSeries(sc.nextLong()));
    }
}
