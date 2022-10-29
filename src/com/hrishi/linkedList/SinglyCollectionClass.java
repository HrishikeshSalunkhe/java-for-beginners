package com.hrishi.linkedList;

import java.util.LinkedList;

public class SinglyCollectionClass {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Add Data at First
        linkedList.addFirst("a");
        linkedList.addFirst("is");
        linkedList.addFirst("This");
        System.out.println(linkedList);

        // Add Data at Last
        linkedList.addLast("Linked");
        linkedList.addLast("List");
        System.out.println(linkedList);


        // Get size of list
        System.out.println(linkedList.size());
        
        // Iterating through for loop
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i)+ " ");
        }
        System.out.println();


        //Delete from first
        linkedList.removeFirst();
        System.out.println(linkedList);

        // Delete from Last
        linkedList.removeLast();
        System.out.println(linkedList);
    }

}
