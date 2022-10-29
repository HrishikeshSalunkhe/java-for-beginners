package com.hrishi.stack;

import java.util.Stack;

public class ReverseStack {
    static Stack<Integer> integerStack = new Stack<>();

    public static void main(String[] args) {
        integerStack.push(11);
        integerStack.push(22);
        integerStack.push(33);
        System.out.println("Before reversing the Stack: " + integerStack);
        reverseStack(integerStack);
        System.out.println("After reversing the Stack: " + integerStack);

    }

    private static void reverseStack(Stack<Integer> integerStack) {
        if(integerStack.empty()){
            return;
        }
        int top = integerStack.pop();
        reverseStack(integerStack);
        pushElementAtBottom(integerStack, top);
    }

    private static void pushElementAtBottom(Stack<Integer> integerStack,int i) {
        if(integerStack.empty()){
            integerStack.push(i);
            return;
        }
        int top = integerStack.pop();
        pushElementAtBottom(integerStack,i);
        integerStack.push(top);
    }
}
