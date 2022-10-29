package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListContainsMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");

        /**
         * contains() method:  used for checking
         *                     if the specified
         *                     element exists in
         *                     the given list or not.
         * Parameters: object- element whose presence
         *              in this list is to be tested
         *
         * Returns:  It returns true if the specified
         *           element is found in the
         *           list else it returns false.
         */
        boolean isPresent = namesList3.contains("ABC");
        if(isPresent){
            System.out.println("ABC is present");
        }
        else{
            System.out.println("ABC is not Present");
        }
    }
}
