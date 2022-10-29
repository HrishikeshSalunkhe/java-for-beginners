package com.hrishi.stack;

public class StackusingLinkedList {
    // Node Class
    static Node head;
    static class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Stack Class
    static class Stack{
        public static  void push(int data){
            Node nn = new Node(data);
            if (!isEmpty()) {
                nn.next = head;
            }
            head = nn;
        }
        public static  int pop(){
            int top;
            if(isEmpty()){
                top = -1;
            }
            else{
                Node temp = head;
                head = head.next;
                top = temp.data;
                temp.next = null;
            }
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
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
