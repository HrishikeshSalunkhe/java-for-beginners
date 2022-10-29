package com.hrishi.searching;

import java.util.Scanner;

/**
 * @author Hrishikesh Salunkhe
 */

/**
 * In Linear Search, searching is done by traversing every element
 * from Start to End or End to Start.
 * The Complexity of Linear Search is
 * Best case O(1)
 * Worst case O(n)
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Search Program ");
        int myArr[] = {1,2,3,4,5,6,7,8,9};
        int size = myArr.length;
        System.out.println("Enter a element to search in Array");
        int elementToSearch = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(elementToSearch == myArr[i]){
                System.out.println("Element Found");
            }

        }
    }
}
