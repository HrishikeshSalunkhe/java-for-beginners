package com.hrishi.javaBasics;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Casting and Type Conversion: ");

        // Implicit Casting
        short num=1;
        int num2 = num +2;
        System.out.println(num2);
        double num3 = num2 + 2;
        System.out.println(num3);

        // Explicit Casting
        String num4= "1.0";
        System.out.println(Float.parseFloat(num4)+4.4);
    }
}
