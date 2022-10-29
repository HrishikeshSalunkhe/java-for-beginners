package com.hrishi.ArrayAndArrayList;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Two-D Array in Java");
        // Create a 2-D Array
        int myArr[][] = new int[3][3];

        // Inserting vales in Array
        myArr[0][0] =1;
        myArr[1][1] = 1;
        myArr[2][2] = 1;

        //Accessing the elements
        System.out.println(myArr[0][0]);
        System.out.println(myArr[1][1]);

        // Display the elements of array
        System.out.println("Array Elements: ");
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[0].length; j++) {
                System.out.print(myArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
