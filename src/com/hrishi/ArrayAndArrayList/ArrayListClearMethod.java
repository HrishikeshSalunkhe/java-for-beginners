package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListClearMethod {
    public static void main(String[] args) {

        // Create Array List with sting data type
        ArrayList<String> namesList2 = new ArrayList<>();

        // Add objects to the Array List
        namesList2.add("ABC");
        namesList2.add("PQR");
        namesList2.add("XYZ");

        //Print the Array List Elements
        System.out.println("Before the use of clear() method");
        for (String s : namesList2) {
            System.out.println(s);
        }

        /**
         * clear method: This method is used to remove all the elements from any list.
         */
        namesList2.clear();

        // print the Array List to check whether array elements are 
        // deleted or not?
        System.out.println("After the use of clear() method: ");
        for (int i = 0; i < namesList2.size(); i++) {
            System.out.println(namesList2.get(i));
        }




    }
}
