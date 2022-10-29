package com.hrishi.recursion;

import java.util.Scanner;

/**
 * @author: Hrishikesh Salunkhe
 */

/**
 * A Program On Binary Search using Recursion
 *
 */
public class BinarySearch {
    /**
     * A function with name binarySearch
     * @param Arr Array contains the elemts
     * @param left start of the array
     * @param right end of the array
     * @param numberToCheck: a number to check if it is present or not
     * @return returns the index value at which the number is present
     * It returns -1 if element is not found in array
     */
    public static  int binarySearch(int Arr[],int left,int right,int numberToCheck){
        if(left > right){
            return -1;
        }
        int mid = left +((right -left)/2);
        if(numberToCheck == Arr[mid]){
            return  mid;
        }
        if(numberToCheck < Arr[mid]){
            return binarySearch(Arr,left,mid-1,numberToCheck);
        }
        else{
            return binarySearch(Arr,mid+1,right,numberToCheck);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome-to program on Binary Search using Recursion:");
        int Arr[] ={11,22,33,44,55,66,77,88,99};
        int left =0;
        int right = Arr.length-1;
        System.out.println("Enter A Number to check in Array:");
        int numberToCheck = sc.nextInt();
        System.out.println(binarySearch(Arr,left,right,numberToCheck));
    }
}
