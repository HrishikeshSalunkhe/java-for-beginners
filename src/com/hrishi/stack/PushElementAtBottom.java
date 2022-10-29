package com.hrishi.stack;

import java.util.Stack;

public class PushElementAtBottom {
    static Stack<Integer> integerStack = new Stack<>();

    public static void main(String[] args) {
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println("Before pushing the element at bottom of Stack: " + integerStack);
        pushElementAtBottom(integerStack,4);
        System.out.println("After pushing the element at bottom of Stack: " + integerStack);
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
