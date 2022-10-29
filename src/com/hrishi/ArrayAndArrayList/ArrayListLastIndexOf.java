package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListLastIndexOf {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");
        namesList3.add("PQR");
        /**
         * lastIndexOf() method:  used to get the index of the last occurrence
         *                          of an element in an ArrayList object.
         *
         * Parameter : The element whose last index is to be returned.
         *
         * Returns : It returns the last occurrence of the element
         *              passed in the parameter.
         *              It returns -1 if the element is not found.
         */
        int lastIndexOfPQR = namesList3.lastIndexOf("PQR");
        System.out.println("Last Index of PQR: " + lastIndexOfPQR);
    }
}
