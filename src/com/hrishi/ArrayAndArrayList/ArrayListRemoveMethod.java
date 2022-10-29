package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");

        // Before remove() method
        System.out.println("Before remove() method");
        for (int i = 0; i < namesList3.size(); i++) {
            System.out.println(namesList3.get(i));
        }

        /**
         * remove(Object): It accepts object to be removed.
         *                 It returns true if it finds,
         *                 and removes the element.
         *                 It returns false if the element
         *                 to be removed is not present.
         * remove(index): It accepts index to be removed.
         *                  It returns element which is to be
         *                  removed.
         *                  It returns Exception if the index is out of bound.
         *   Removes the first occurrence of the specified element from given list,
         *   if the element is present. If the element is not present, the given list is not changed.
         *   After removing, it shifts subsequent elements(if any) to left
         *   and decreases their indexes by 1.
         */
        System.out.println("After remove() method with index as Object");
        // remove method with object as parameters
        System.out.println("Return type for remove method with object  as parameter: "+namesList3.remove("ABC"));
        for (int i = 0; i < namesList3.size(); i++) {
            System.out.println(namesList3.get(i));
        }

        System.out.println("After remove() method with index as parameter");
        // remove method with index as parameter
        System.out.println("Return type for remove method with index  as parameter: "+namesList3.remove(1));
        for (int i = 0; i < namesList3.size(); i++) {
            System.out.println(namesList3.get(i));
        }

    }
}
