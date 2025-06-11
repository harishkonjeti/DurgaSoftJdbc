package org.core.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Udemy2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        List strList = list;
        strList.add("abc");
        System.out.println(strList);
        System.out.println(list);

        addIncorrectData(list);
        System.out.println(list);

        //Inheritance in generics
        List<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add("def");

        printList(strList1);
        printList(list);
    }

    private static void addIncorrectData(List list) {
        //type erasure
        //for arrays it is not possible
        list.add("edf");
    }

    private static void addIncorrectStringData(Object[] intArray) {
//        arrays won't allow type erasure
        intArray[0] = "abc";
    }

    private static <T> void printList(List<T> list) {
        System.out.println(list);
    }
}
