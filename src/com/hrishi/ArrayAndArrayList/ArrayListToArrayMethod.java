package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListToArrayMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");
        namesList3.add("PQR");

        // Create a Array to store the values
        String[] myArray = new String[namesList3.size()] ;
        // toArray():  returns array containing all elements in ArrayList
        namesList3.toArray(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
