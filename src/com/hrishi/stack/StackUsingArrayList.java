package com.hrishi.stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    static class Stack{
        public static void push(int data){
            arrayList.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            return arrayList.remove(arrayList.size()-1);
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arrayList.get(arrayList.size()-1);

        }

        public static boolean isEmpty(){
            if(arrayList.size() == 0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        StackusingLinkedList.Stack stack = new StackusingLinkedList.Stack();
        System.out.println("POP operation on empty stack return -1: " + stack.pop());
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        System.out.println("First PEEK operation: " + stack.peek());
        System.out.println("First pop operation: " + stack.pop());
        System.out.println("Second PEEK operation after one pop operation: " + stack.peek());
        System.out.println("Second pop operation: " + stack.pop());
        System.out.println("Third PEEK operation after one pop operation: " + stack.peek());

    }
}
