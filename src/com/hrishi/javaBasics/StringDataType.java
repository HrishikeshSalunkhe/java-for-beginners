package com.hrishi.javaBasics;

public class StringDataType {
    public static void main(String[] args) {
        System.out.println("String Reference Data Type: ");
        System.out.println("Strings are immutable");
        // Strings are immutable
        String name = "Java Development Kit(JDK)";
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.endsWith(")"));
        System.out.println(name.startsWith("Ja"));
        System.out.println(name.indexOf("D"));
        System.out.println(name.length());
        System.out.println(name.replace("Java","JaVa"));
        System.out.println(name);
    }
}