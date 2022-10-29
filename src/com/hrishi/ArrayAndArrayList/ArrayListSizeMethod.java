package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListSizeMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");
        namesList3.add("PQR");

        /**
         * size() :  used to get the number of elements in the list.
         * Returns: This method returns the number of elements in this list.
         */

        System.out.println(namesList3.size());
    }
}
