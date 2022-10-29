package com.hrishi.ArrayAndArrayList;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");
        // Create an array
        int myArr[] = new int[10];

        /**
         * Array Indexing always starts from 0
         *  Index   :  0  1  2  3  4  5
         *  Element :  1  2  3  4  5  6
         */
        // Insert Element in Array using INDEX
        myArr[0] = 11;
        myArr[1] = 22;
        myArr[2] = 33;

        // Accessing the Array Elements
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);

        // Length of the Array
        int lengthOfArray = myArr.length;
        System.out.println(lengthOfArray);

    }
}
