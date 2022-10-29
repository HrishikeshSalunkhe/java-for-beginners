package com.hrishi.ArrayAndArrayList;

import java.util.ArrayList;

public class ArrayListSetMethod {
    public static void main(String[] args) {
        // Create Array List of String Data Type
        ArrayList<String> namesList3 = new ArrayList<>();

        // add objects in the Array List
        namesList3.add("ABC");
        namesList3.add("PQR");
        namesList3.add("XYZ");
        namesList3.add("PQR");

        System.out.println("Elements before set() method: ");
        for (int i = 0; i < namesList3.size(); i++) {
            System.out.println(namesList3.get(i));
        }
        // set (): sets the new value at given index
        namesList3.set(3,"APX");


        System.out.println("Elements after set() method: ");
        for (int i = 0; i < namesList3.size(); i++) {
            System.out.println(namesList3.get(i));
        }
    }
}
