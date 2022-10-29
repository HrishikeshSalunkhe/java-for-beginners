package com.hrishi.stack;

import java.util.Stack;

public class StackUsingCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        //If we perform pop operation on empty stack,
        // then it will give exception
        // System.out.println("POP operation on empty stack return -1: " + integerStack.pop());
        integerStack.push(11);
        integerStack.push(22);
        integerStack.push(33);
        integerStack.push(44);
        System.out.println("First PEEK operation: " + integerStack.peek());
        System.out.println("First pop operation: " + integerStack.pop());
        System.out.println("Second PEEK operation after one pop operation: " + integerStack.peek());
        System.out.println("Second pop operation: " + integerStack.pop());
        System.out.println("Third PEEK operation after one pop operation: " + integerStack.peek());

    }
}
