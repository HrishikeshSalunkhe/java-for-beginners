package com.hrishi.ArrayAndArrayList;

public class StringNames {
    public static void main(String[] args) {
        // Create a String Array
        String[] namesList  =new String[10];

        // Insert values in the Array
        namesList[0] ="ABC";
        namesList[1] = "DEF";
        namesList[2] = "GHI";
        namesList[3] = "JKL";
        namesList[4] = "MNO";

        // Display the Array Elements
        for (int i = 0; i < namesList.length; i++) {
            System.out.println(namesList[i]);
        }
    }
}
