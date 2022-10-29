package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListIndexOfMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");

        /**
         *  indexOf() Method: returns the index of the first occurrence
         *                    of the specified element in this list,
         *                    or -1 if this list does not contain the element.
         *
         */
        int index = namesList3.indexOf("PQR");
        System.out.println("Index of PQR:" + index);

    }
}
