package com.hrishi.javaBasics;

public class ToStringMethod {
    String name;
    int age ;
    public  ToStringMethod(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name  + age;
    }

    public static void main(String[] args) {
        ToStringMethod tsm = new ToStringMethod("Hrishi",23);
        System.out.println(tsm);
        ToStringMethod tsm2 = new ToStringMethod("Hrishi",23);
        System.out.println(tsm2.toString());
    }
}
