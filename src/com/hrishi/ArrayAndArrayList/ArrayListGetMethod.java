package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListGetMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");

        /**
         * get() method: used to get the element of
         *               a specified index within the list.
         * Parameter: Index of the elements to be returned.
         *            It is of data-type int.
         *
         * Return Type: The element at the specified index in the given list.
         *
         * Exception: It throws IndexOutOfBoundsException
         *              if the index is out of range.
         */
        System.out.println("Print the Array List");
        // Access the Arraylist using get method
        for (int i = 0; i < namesList3.size(); i++) {
            System.out.println(namesList3.get(i));
        }
    }
}
