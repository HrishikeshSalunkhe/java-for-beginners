package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListAddMethods {
    public static void main(String[] args) {
        /**
         * Always keep in mine that ArrayList can only store
         * Objects. Everything passed to ArrayList should be Object
         */
        // Create a ArrayList of Data Type as String
        ArrayList<String> namesList1 = new ArrayList<String>();

        //Methods in ArrayList
        /**
         * add method : This method is used to insert a specific element
         *              at a specific position index in a list.
         * namesList1.add(int index, Object Element)
         *
         */
        //Below method add ABC at index 0
        namesList1.add(0,"ABC");
        //Below method add DEF at index 0 and shift ABC to index 1
        namesList1.add(0,"DEF");

        //Below method add ABC at last index
        namesList1.add("GHI");

        // Display the Array List
        for (int i = 0; i < namesList1.size(); i++) {
            System.out.println(namesList1.get(i));
        }
    }
}
