package com.hrishi.javaBasics;

import java.util.Arrays;

public class ArrayDataType {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");
        // 1-D Array
        int myArr[] = {5,1,4,3,2};
        System.out.println(Arrays.toString(myArr));
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));

        // 2-D Array
        int my2DArr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(my2DArr));


        // 3-D Array
        int my3DArr[][][] = {{{1,2,3},{4,5,6},{7,8,9}}};
        System.out.println(Arrays.deepToString(my3DArr));
    }
}
