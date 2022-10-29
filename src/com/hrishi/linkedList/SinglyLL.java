package com.hrishi.linkedList;

public class SinglyLL {
    Node head;
    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add element at first position
    public void addFirst(String data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }

    public void addLast(String data){
        Node nn = new  Node(data);
        if(head == null){
            head = nn;
            return;
        }
        Node temp = head;
        while(temp.next != null){ // to get null reference of last node
            temp = temp.next;
        }
        temp.next = nn;
        temp = nn;

    }

    // Delete Operation
    // Delete from first
    public  void deleteFirst(){
        if(head== null){
            System.out.println(" List is empty");
            return;
        }
        head = head.next;
    }

    // Delete from last
    public  void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        Node nextNode = head.next ;
        while (nextNode.next != null){
                nextNode = nextNode.next;
                temp = temp.next;
        }
        temp.next = null;
    }

    // print the list

    public  void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
            SinglyLL singlyLL = new SinglyLL();
            singlyLL.addFirst("a");
            singlyLL.addFirst("is");
            singlyLL.addFirst("This");
            singlyLL.printList();
            System.out.println();
            System.out.println("<----------------->");
            singlyLL.addLast("Linked");
            singlyLL.addLast("List");
            singlyLL.printList();
            System.out.println();
            System.out.println("<----------------->");

            singlyLL.deleteFirst();
            singlyLL.printList();
            System.out.println();
            System.out.println("<----------------->");

            singlyLL.deleteLast();
            singlyLL.printList();
            System.out.println();
            System.out.println("<----------------->");

    }
}
