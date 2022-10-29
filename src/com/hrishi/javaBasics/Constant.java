package com.hrishi.javaBasics;

public class Constant {
    public static void main(String[] args) {
        System.out.println("Constants in Java");
        double pi = 3.14;
        final double PI = 3.14;

        System.out.println(pi);
        System.out.println(PI);
        pi=1;
        System.out.println(pi);
        //Uncomment below code to check
        //PI =1;
        System.out.println(PI);
    }
}
