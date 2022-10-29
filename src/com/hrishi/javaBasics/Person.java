package com.hrishi.javaBasics;

/**
 * Demonstration on Equality operator in Java
 */
public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean equal(Person Something){
        return this.name.equals(Something.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Hrishi",23);
        Person person2 = new Person("Hrishi ",22);
        System.out.println(person1.equal(person2));
    }
}
