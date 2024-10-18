package org.core.java.collections;


import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        System.out.println(linkedList);
        linkedList.addFirst("X");
        linkedList.addLast("Y");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        linkedList.add(3,"B");
        linkedList.add(5,"B");
        System.out.println(linkedList);
        System.out.println(linkedList.removeFirstOccurrence("B"));
        System.out.println(linkedList);
        System.out.println(linkedList.removeLastOccurrence("B"));
        System.out.println(linkedList);
    }
}
